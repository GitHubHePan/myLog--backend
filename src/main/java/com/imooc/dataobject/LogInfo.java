package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by TvT on 2018/11/7.
 * @Data    依赖的是lombok
 */

@Entity
@DynamicUpdate
@Data
public class LogInfo {

    /** 日誌Id. */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer logId;

    /** 日誌內容. */
    private String logData;

    /** 可編輯.*/
    private Integer isEdit;

    /** 日誌照片*/
    private String logPicture;

    /** 创建时间*/
    private Date createTime;

    /** 修改时间*/
    private Date updateTime;

}
