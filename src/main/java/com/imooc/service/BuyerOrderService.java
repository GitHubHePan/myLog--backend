package com.imooc.service;

import com.imooc.VO.OrderResponseVO;
import com.imooc.form.OrderForm;

public interface BuyerOrderService {

    OrderResponseVO insertOrdermaster(OrderForm orderForm);

}
