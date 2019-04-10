package com.imooc.dao;

        import com.imooc.entity.User;
        import java.util.List;

public interface UserDao{
    List<User> queryUser();
    User queryUserById(int id);
    int insertUser(User user);
    int updateUser(User user);
    int deleteUser(int id);
}