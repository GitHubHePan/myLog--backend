package com.imooc.entity;

import lombok.Data;

@Data
public class OrderMaster {

private String orderId;

private String buyerName;

private  String buyerPhone;

private String buyerAddress;

private String buyerOpenId;

private int orderAmount;

private int orderStatus;

private int payStatus;
}
