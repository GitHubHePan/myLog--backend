package com.imooc.dao;

import com.imooc.entity.ProductInfo;

import java.util.List;

public interface ProductInfoDao {
    List<ProductInfo> queryProductInfo();
    ProductInfo queryProductInfoById(String id);
    int insertProductInfo(ProductInfo productInfo);
    int updateProductInfo(ProductInfo productInfo);
    int deleteProductInfo(int id);
}
