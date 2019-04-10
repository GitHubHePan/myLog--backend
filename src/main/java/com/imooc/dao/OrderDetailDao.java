package com.imooc.dao;

import com.imooc.entity.OrderDetail;
import com.imooc.form.ProductInfoForm;

import java.util.List;

public interface OrderDetailDao {

    List<OrderDetail> queryOrderDetail();

    OrderDetail queryOrderDetailById(int id);

    int insertOrderDetail(OrderDetail orderDetail);

    int deleteOrderDetail(int id);

    int insertOrderDetailList(List<ProductInfoForm> productInfoForm);
}
