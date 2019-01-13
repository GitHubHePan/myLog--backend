package com.imooc.dataobject.mapper;

import static org.junit.Assert.*;

import com.imooc.dataobject.LogInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogInfoMapperTest {

  @Autowired
  private LogInfoMapper logMapper;

  @Test
  public void selectAll() throws Exception{
    List result = logMapper.selectAll();
    System.out.println(result);
    Assert.assertEquals(8,result.size());
  }

  @Test
  public void insertByMap() throws Exception{
    Map<String,Object> map = new HashMap<>();
    map.put("log_data","weiweiwwww");
    map.put("is_edit",1);
    map.put("log_picture" ,"qwerqwer123412341");
    int result = logMapper.insertByMap(map);
    System.out.println(result);
    Assert.assertEquals(1,result);
  }



  @Test
  public void insertByObj() throws Exception{
    LogInfo logInfo = new LogInfo();
    logInfo.setLogData("werwerwerw");
    logInfo.setIsEdit(1);
    logInfo.setLogPicture("www.baidu.com");
    int result = logMapper.insertByObj(logInfo);
    System.out.println(result);
    Assert.assertEquals(1,result);
  }

  @Test
  public void selectByDate() throws Exception{
    List result = logMapper.selectByDate("2018-11-16", "2019-02-05");
    System.out.println(result);
    Assert.assertEquals(1,result.size());
  }

  @Test
  public void updateByObj() throws Exception{
    List result = logMapper.selectByDate("2018-11-16", "2019-02-05");
    System.out.println(result);
    Assert.assertEquals(1,result.size());
  }

}