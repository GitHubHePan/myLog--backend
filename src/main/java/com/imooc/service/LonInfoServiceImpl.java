package com.imooc.service;

import com.imooc.dao.LogInfoDao;
import com.imooc.dataobject.LogInfo;
import com.imooc.service.impl.LogInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by TvT on 2018/11/8.
 */

@Service
public class LonInfoServiceImpl implements LogInfoService {


    @Autowired
    private LogInfoDao logInfoDao;

    @Override
    public Optional<LogInfo> findOne(Integer logId) {
        System.out.println(logId);
        return logInfoDao.findById(logId);
    }

    @Override
    public List<LogInfo> findAll() {
        return logInfoDao.findAll();
    }

    @Override
    public List<LogInfo> findByCreateDate(Date createTime) {
        return logInfoDao.findByCreateTimeIn(createTime);
    }

    @Override
    public LogInfo save(LogInfo logInfo) {
        return logInfoDao.save(logInfo);
    }
}
