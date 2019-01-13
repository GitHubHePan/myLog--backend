package com.imooc.service.impl;

import com.imooc.dataobject.LogInfo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by TvT on 2018/11/8.
 */
public interface LogInfoService {

    Optional<LogInfo> findOne(Integer logId);

    List<LogInfo> findAll();

    List<LogInfo> findByCreateDate(Date createTime);

    LogInfo save(LogInfo logInfo);

}
