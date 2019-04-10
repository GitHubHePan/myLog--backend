package com.imooc.service.impl;

import com.imooc.dao.UserDao;
import com.imooc.entity.User;
import com.imooc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.beans.Transient;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<User> queryUser() {
        return userDao.queryUser();
    }

    @Override
    public User queryUserById(int id) {
        return userDao.queryUserById(id);
    }

    @Transactional
    @Override
    public Boolean insertUser(User user) {
        if (user.getUsername() != null || "".equals(user.getUsername())) {
            try{
                int effectNum = userDao.insertUser(user);
                if(effectNum> 0 ){
                    return true;
                }else{
                    throw new RuntimeException("插入个人信息失败");

                }
            }catch(Exception e){
                throw new RuntimeException("插入个人信息失败："+e.getMessage());
            }
        }else{
            throw new RuntimeException("插入个人信息失败");
        }
    }

    @Override
    public Boolean updateUser(User user) {
        if (user.getUsername() != null || "".equals(user.getUsername())) {
            try{
                int effectNum = userDao.updateUser(user);
                if(effectNum> 0 ){
                    return true;
                }else{
                    throw new RuntimeException("更新个人信息失败");

                }
            }catch(Exception e){
                throw new RuntimeException("更新个人信息失败："+e.getMessage());
            }
        }else{
            throw new RuntimeException("更新个人信息失败");
        }
    }

    @Override
    public Boolean deleteUser(int id) {
        if (id > 0) {
            try{
                int effectNum = userDao.deleteUser(id);
                if(effectNum> 0 ){
                    return true;
                }else{
                    throw new RuntimeException("删除个人信息失败");

                }
            }catch(Exception e){
                throw new RuntimeException("删除个人信息失败："+e.getMessage());
            }
        }else{
            throw new RuntimeException("删除个人信息失败");
        }
    }
}
