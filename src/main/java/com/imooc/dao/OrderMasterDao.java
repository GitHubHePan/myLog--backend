package com.imooc.dao;

import com.imooc.entity.OrderMaster;
import com.imooc.form.OrderForm;

import java.util.List;

public interface OrderMasterDao {
//    List<OrderMaster> queryOrderMaster();
//    OrderMaster queryOrderMasterById(int id);
//    int insertOrderMaster(OrderMaster orderMaster);
//    int updateOrderMaster(OrderMaster orderMaster);
//    int deleteOrderMaster(int id);
    /*
    *  查询ordermaster表中最大的id
    * */
    int  insertOrderMasterGetId(OrderForm orderForm);
}
