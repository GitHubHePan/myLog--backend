package com.imooc.dao;

import com.imooc.entity.User;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired
    private UserDao userDao;

    @Test
    @Ignore
    public void queryName() {
        List<User> userList = userDao.queryUser();
        assertEquals(1,userList.size());
    }

    @Test
    @Ignore
    public void queryNameById() {
        User user = userDao.queryUserById(1);
        assertEquals("ww",user.getUsername());

    }

    @Test
    public void insertName() {
        User user = new User();
        user.setId(3);
        user.setOpenid("1234asdfgertwqerqewr");
        user.setPassword("123456");
        user.setUsername("wwerw1");
        int id = userDao.insertUser(user);
        assertEquals(1,id);


    }

    @Test
    public void updateName() {
        User user = new User();
        user.setId(2);
        user.setOpenid("sdfgadsgaewr");
        user.setPassword("654321");
        user.setUsername("helloWorld");
        int effectUnm = userDao.updateUser(user);
        assertEquals(1,effectUnm);
    }

    @Test
    @Ignore
    public void deleteName() {
        int effectUnm = userDao.deleteUser(2);
        assertEquals(1,effectUnm);
    }
}