package com.gil.mybatis.service.impl;

import com.gil.mybatis.mapper.MyBatisMapper;
import com.gil.mybatis.service.MyBatisService;
import com.gil.mybatis.vo.MybatisVo;
import com.gil.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyBatisServiceImpl implements MyBatisService {

    @Autowired
    private MyBatisMapper myBatisMapper;

    public MyBatisServiceImpl() {

    }

    @Override
    public MybatisVo requestTest1() {
        return myBatisMapper.requestTest1();
    }
}
