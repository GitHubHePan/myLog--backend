package com.imooc.VO;

import lombok.Data;

@Data
public class UserVO {
    /*用户名 - 昵称*/
    private String name;
    /*密码*/
    private String password;

    /*openId*/
    private String openId;
}
