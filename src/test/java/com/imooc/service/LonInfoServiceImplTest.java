package com.imooc.service;

import com.imooc.dataobject.LogInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

/**
 * Created by TvT on 2018/11/8.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LonInfoServiceImplTest {

    @Autowired
    private LonInfoServiceImpl lonInfoServiceimpl;

    @Test
    public void testFindOne() throws Exception {
        Optional<LogInfo> result = lonInfoServiceimpl.findOne(1);
        Assert.assertEquals(new Integer(1),result.get().getLogId());
    }
//
    @Test
    public void testFindAll() throws Exception {
        List<LogInfo> result = lonInfoServiceimpl.findAll();
        Assert.assertEquals(4,result.size());
    }

    @Test
    public void testFindByCreateDate() throws Exception {
        System.out.println(">>>>>>>>>>>"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-11-15 21:51:57"));
        List<LogInfo> result = lonInfoServiceimpl.findByCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2018-11-15 21:51:57"));
        System.out.println(result);
    }

    @Test
    public void testSave() throws Exception {
        LogInfo logInfo = new LogInfo();
        logInfo.setLogData("hello world");
        logInfo.setLogId(6);
        logInfo.setLogPicture("www.baicu.com");
        logInfo.setIsEdit(1);
        lonInfoServiceimpl.save(logInfo);
    }
}