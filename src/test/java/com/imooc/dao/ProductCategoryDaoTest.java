package com.imooc.dao;

import com.imooc.entity.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryDaoTest {

    @Autowired
    private ProductCategoryDao productCategoryDao;

    @Test
    public void queryProductCategory() {
        List<ProductCategory> result = productCategoryDao.queryProductCategory();
        assertEquals(1 , result.size());
    }

    @Test
    public void queryProductCategoryById() {
        ProductCategory result = productCategoryDao.queryProductCategoryById(1);
        assertEquals("热销榜" , result.getCategoryName());
    }

    @Test
    public void insertProductCategory() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId("2");
        productCategory.setCategoryName("水果类");
        productCategory.setCategoryType(2);
        int affectNum = productCategoryDao.insertProductCategory(productCategory);
        assertEquals(1,affectNum);
    }

    @Test
    public void updateProductCategory() {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryId("1");
        productCategory.setCategoryName("热菜类");
        productCategory.setCategoryType(4);
        int affectNum = productCategoryDao.updateProductCategory(productCategory);
        assertEquals(1,affectNum);
    }

    @Test
    public void deleteProductCategory() {
        int affectNum = productCategoryDao.deleteProductCategory(1);
        assertEquals(1,affectNum);
    }
}