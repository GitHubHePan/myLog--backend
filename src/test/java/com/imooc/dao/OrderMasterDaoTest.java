package com.imooc.dao;

import com.imooc.form.OrderForm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class OrderMasterDaoTest {

    @Autowired
    private  OrderMasterDao orderMasterDao;

    @Test
    public void insertOrderMasterGetId() {
        OrderForm orderForm = new OrderForm();
        orderForm.setAddress("sasd");
        orderForm.setName("sds");
        orderForm.setOpenid("12");
        orderForm.setPhone("sdsd");
        int a = orderMasterDao.insertOrderMasterGetId(orderForm);
        assertEquals(1,a);
    }
}