package com.imooc.entity;

import lombok.Data;

@Data
public class ProductInfo {
    private String productId;

    private String productName;

    private int productPrice;

    private int productStock;

    private String productDescription;

    private String productIcon;

    private int productStatus;

    private int categoryType;
}
