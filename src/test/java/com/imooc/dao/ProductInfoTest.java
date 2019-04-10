package com.imooc.dao;

import com.imooc.entity.ProductInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoTest {
    @Autowired
    private ProductInfoDao productInfoDao;
    @Test
    public void queryProductInfo() {
        List<ProductInfo> productInfoList = productInfoDao.queryProductInfo();
        assertEquals(1,productInfoList.size());
    }

    @Test
    public void queryProductInfoById() {
        ProductInfo result = productInfoDao.queryProductInfoById("1");
        assertEquals("hello",result.getProductName());
    }

    @Test
    public void insertProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setCategoryType(1);
        productInfo.setProductPrice(123);
        productInfo.setProductDescription("sdssdsdssds");
        productInfo.setProductIcon("asdfasdf.jpg");
        productInfo.setProductId("2");
        productInfo.setProductName("kitty");
        productInfo.setProductStatus(1);
        productInfo.setProductStock(1234);
        int effectRow = productInfoDao.insertProductInfo(productInfo);
        assertEquals(1,effectRow);
    }

    @Test
    public void updateProductInfo() {
        ProductInfo productInfo = new ProductInfo();
        productInfo.setProductId("2");
        productInfo.setCategoryType(2);
        productInfo.setProductPrice(342);
        productInfo.setProductDescription("hello");
        productInfo.setProductIcon("asdfasdf.jpg");
        productInfo.setProductId("2");
        productInfo.setProductName("hello kitty");
        productInfo.setProductStatus(1);
        productInfo.setProductStock(12345);
        int effectRow = productInfoDao.updateProductInfo(productInfo);
        assertEquals(1,effectRow);
    }

    @Test
    public void deleteProductInfo() {
        int effectRow = productInfoDao.deleteProductInfo(2);
        assertEquals(1,effectRow);
    }
}