package com.imooc.entity;

import lombok.Data;

@Data
public class OrderDetail {
    private String detailId;

    private String orderId;

    private String productId;

    private String productName;

    private int productPrice;

    private int productQuantity;

    private String productIcon;
}
