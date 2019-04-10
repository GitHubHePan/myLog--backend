package com.imooc.dao;

import com.imooc.VO.CategoryVo;
import com.imooc.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryDao {
    List<ProductCategory> queryProductCategory();
    ProductCategory queryProductCategoryById(int id);
    int insertProductCategory(ProductCategory productCategory);
    int updateProductCategory(ProductCategory productCategory);
    int deleteProductCategory(int id);
    List<CategoryVo> queryProductCategorys();
}
