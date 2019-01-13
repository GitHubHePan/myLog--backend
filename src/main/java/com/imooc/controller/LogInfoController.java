package com.imooc.controller;

import com.imooc.VO.Aaa;
import com.imooc.VO.Page;
import com.imooc.VO.ResultVO;
import com.imooc.units.ResultUnits;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 日记
 * Created by TvT on 2018/11/17.
 */
@RestController
@RequestMapping("/logInfo")
public class LogInfoController {


    @GetMapping("/list")
    public ResultVO list( @RequestParam @Valid Page page,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return ResultUnits.error(0,1,"sdfsd");
        }
        Aaa aa = new Aaa();
        aa.setName("sss");
        return ResultUnits.success(aa);
    }
}
