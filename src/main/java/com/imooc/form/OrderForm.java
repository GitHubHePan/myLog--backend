package com.imooc.form;


import lombok.Data;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class OrderForm {

    private String orderId;

    @NotEmpty(message = "姓名必填")
    private String name;

    @NotEmpty(message = "手机号必填")
    private String phone;

    @NotEmpty(message = "地址必填")
    private String address;

    @NotEmpty(message = "openid必填")
    private String openid;

    @NotEmpty(message= "购物车不能为空")
    private List<ProductInfoForm> items;
}
