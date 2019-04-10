package com.imooc.controller;

import com.imooc.VO.OrderResponseVO;
import com.imooc.VO.ResultVO;
import com.imooc.enums.ResultEnum;
import com.imooc.exception.SellException;
import com.imooc.form.OrderForm;
import com.imooc.service.impl.BuyerOrderImpl;
import com.imooc.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

@RestController
@RequestMapping("/buyer/order")
@Slf4j
public class BuyerOrderController {

    @Autowired
    private BuyerOrderImpl buyerOrder;

    @PostMapping("/create")
    public ResultVO<OrderResponseVO> create(@Valid @RequestBody OrderForm orderForm,
                                            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            throw new SellException(ResultEnum.PARAM_ERROR.getCode(),
                    bindingResult.getFieldError().getDefaultMessage());
        }else{
            ResultVO resultVO = ResultVOUtil.success(buyerOrder.insertOrdermaster(orderForm));
            return resultVO;
        }
    }
}
