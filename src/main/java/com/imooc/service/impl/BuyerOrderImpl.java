package com.imooc.service.impl;

import com.imooc.VO.OrderResponseVO;
import com.imooc.dao.OrderDetailDao;
import com.imooc.dao.OrderMasterDao;
import com.imooc.dao.ProductInfoDao;
import com.imooc.entity.ProductInfo;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.form.ProductInfoForm;
import com.imooc.service.BuyerOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class BuyerOrderImpl implements BuyerOrderService {
    @Autowired
    private OrderMasterDao orderMasterDao;

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Autowired
    private ProductInfoDao productInfoDao;
    @Transactional
    @Override

    public OrderResponseVO insertOrdermaster(OrderForm orderForm) {
        List<ProductInfoForm> productInfoList = orderForm.getItems();
        for (ProductInfoForm productInfoItem : productInfoList) {
            ProductInfo productInfo = productInfoDao.queryProductInfoById(productInfoItem.getProductId());
            if (productInfo.getProductStock() < productInfoItem.getProductQuantity() ) {
                log.error(ResultEnum.OVER_SOCKET.getMessage());
                throw new SellException(ResultEnum.OVER_SOCKET);
            }
        }
        List<ProductInfoForm> productInfoFormList = orderForm.getItems();
        orderMasterDao.insertOrderMasterGetId(orderForm);
        String orderId = orderForm.getOrderId();
        for (ProductInfoForm productInfoForm : productInfoFormList) {
            productInfoForm.setOrderId(orderId);
        }
        orderDetailDao.insertOrderDetailList(productInfoFormList);
        OrderResponseVO orderResponseVO = new OrderResponseVO();
        orderResponseVO.setOrderId(orderForm.getOrderId());
        return orderResponseVO;
    }
}
