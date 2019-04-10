package com.imooc.service.impl;

import com.imooc.VO.CategoryVo;
import com.imooc.VO.ProductVo;
import com.imooc.dao.ProductCategoryDao;
import com.imooc.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<CategoryVo> queryProductCategory(){
        return productCategoryDao.queryProductCategorys();
    };
}
