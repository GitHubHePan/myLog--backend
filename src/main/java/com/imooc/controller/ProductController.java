package com.imooc.controller;

import com.imooc.VO.CategoryVo;
import com.imooc.VO.ResultVO;
import com.imooc.service.ProductCategoryService;
import com.imooc.service.impl.ProductCategoryImpl;
import com.imooc.utils.ResultVOUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.ResolverUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buyer")
@Slf4j
public class ProductController {

    @Autowired
    private ProductCategoryImpl productCategory;

    @GetMapping("/product/list")
    public ResultVO<CategoryVo> getUserList() {
        List<CategoryVo> data = productCategory.queryProductCategory();
        return ResultVOUtil.success(data);
    }
}
