package com.imooc.entity;

        import lombok.Data;

@Data
public class User {

    private int type;

    private int id;

    private String username;

    private String password;

    private String openid;
}
