package com.imooc.controller;

import com.imooc.VO.ResultVO;
import com.imooc.service.impl.UserServiceImpl;
import com.mysql.cj.Session;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @GetMapping("/list")
    public ResultVO getUserList(){
        ResultVO result = new ResultVO();
        result.setCode(0);
        result.setMsg("chenggong");
        log.info("sdsdssds");
        result.setData(userServiceImpl.queryUser());
        return result;

    }
}
