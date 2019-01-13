package com.imooc.dao;

import com.imooc.dataobject.LogInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * Created by TvT on 2018/11/7.
 */
public interface LogInfoDao extends JpaRepository<LogInfo,Integer>{

    List<LogInfo> findByCreateTimeIn(Date createTime);
}
