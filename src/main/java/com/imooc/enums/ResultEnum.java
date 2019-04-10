package com.imooc.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {

    PARAM_ERROR(1,"参数不正确"),
    PRODUCT_NOT_EXIST(10,"商品不存在"),
    EMPTY_SHOPPING_CAR(11,"购物车不可为空"),
    OVER_SOCKET(12,"选购的数量不足"),
    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code,String message){
        this.code = code;
        this.message = message;
    }


}
