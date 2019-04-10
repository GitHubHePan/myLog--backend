package com.imooc.service;

import com.imooc.entity.User;

import java.util.List;


public interface UserService {
    List<User> queryUser();
    User queryUserById(int id);
    Boolean insertUser(User user);
    Boolean updateUser(User user);
    Boolean deleteUser(int id);
}
