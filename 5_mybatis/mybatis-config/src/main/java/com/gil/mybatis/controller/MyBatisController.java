package com.gil.mybatis.controller;

import com.gil.mybatis.service.MyBatisService;
import com.gil.mybatis.service.impl.MyBatisServiceImpl;
import com.gil.mybatis.vo.MybatisVo;
import com.gil.utils.ApiResult;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyBatisController {

    private final MyBatisServiceImpl myBatisService;

    public MyBatisController(MyBatisServiceImpl myBatisService) {
        this.myBatisService = myBatisService;
    }

    @PostMapping(value = "/test1", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ApiResult<MybatisVo> requestTest1(){
        System.out.println("요청실행");
        return ApiResult.succeed(myBatisService.requestTest1(), "조회 성공");
    }


}
