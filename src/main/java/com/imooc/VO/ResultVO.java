package com.imooc.VO;

import lombok.Data;

/**
 * 请求最外层对象
 * Created by TvT on 2018/11/18.
 */
@Data
public class ResultVO<T> {
    /*返回码*/
    private Integer code;
    /*返回信息*/
    private String msg;
    /*返回数据*/
    private T data;
}
