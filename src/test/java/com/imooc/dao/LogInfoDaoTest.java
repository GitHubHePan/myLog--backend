package com.imooc.dao;

import com.imooc.dataobject.LogInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by TvT on 2018/11/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LogInfoDaoTest {

    @Autowired
    private LogInfoDao logInfoDao;

    @Test
    public void findOneTest(){
        List<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(2);
        Optional<LogInfo> logInfo = logInfoDao.findById(1);
        System.out.println(logInfo.toString());
    }

    @Test
    public void  saveTest(){
        LogInfo logInfo = new LogInfo();
        logInfo.setIsEdit(1);
        logInfo.setLogData("sdsfsfsdf");
        logInfo.setLogPicture("www.baidu.com");
        logInfoDao.save(logInfo);
    }



    @Test
    public void updateTest(){
        Optional<LogInfo> logInfos = logInfoDao.findById(1);
//        logInfos.get().setLogData("wde333");
        LogInfo result = logInfoDao.save(logInfos.get());
        Assert.assertNotNull(result);
    }


//    @Test
//    public void updateTest
//

}