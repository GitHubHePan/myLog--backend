package com.imooc.dao;

import com.imooc.entity.OrderDetail;
import com.imooc.form.ProductInfoForm;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.repository.query.Param;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderDetailDaoTest {

    @Autowired
    private OrderDetailDao orderDetailDao;

    @Test
    @Ignore
    public void queryOrderDetail() {
        List<OrderDetail> orderDetailList = orderDetailDao.queryOrderDetail();
        assertEquals(2,orderDetailList.size());
    }

    @Test
    public void queryOrderDetailById() {
        OrderDetail result = orderDetailDao.queryOrderDetailById(1);
        assertEquals("weqr",result.getProductName());
    }

    @Test
    @Ignore
    public void insertOrderDetail() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("3");
        orderDetail.setOrderId("rqwer1234ae");
        orderDetail.setProductId("12");
        orderDetail.setProductQuantity(1);
        int effectRow = orderDetailDao.insertOrderDetail(orderDetail);
        assertEquals(1,effectRow);

    }

    @Test
    public void deleteOrderDetail() {
        int effectRow = orderDetailDao.deleteOrderDetail(3);
        assertEquals(1,effectRow);
    }

    @Test
    public void productInfoFormList(){
//        List<ProductInfoForm> productInfoFormList = new ArrayList<ProductInfoForm>();
//        productInfoFormList.add(new ProductInfoForm("a","sdsds","c",1));
//        productInfoFormList.add(new ProductInfoForm("aa","sdsds","ca",1));
//        int a = orderDetailDao.insertOrderDetailList( productInfoFormList);
//        System.out.println(a);
    }
}