package com.imooc.units;

import com.imooc.VO.ResultVO;
import com.imooc.emums.ResultEnum;

public class ResultUnits {

  // 成功返回
  public static ResultVO success(Object object){
    ResultVO resultVo = new ResultVO();
    resultVo.setCode(ResultEnum.SUCCESS.getCode());
    resultVo.setMsg(ResultEnum.SUCCESS.getMsg());
    resultVo.setData(object);
    return  resultVo;
  }

  //出错返回
  public static ResultVO error(Object object,Integer code,String msg){
    ResultVO resultVo = new ResultVO();
    resultVo.setCode(code);
    resultVo.setMsg(msg);
    resultVo.setData(object);
    return  resultVo;
  }

  //data为null的时候
  public static ResultVO success(){
    return  success(null);
  }

}
