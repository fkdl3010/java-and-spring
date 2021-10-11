package com.gil.mybatis.service.impl;

import com.gil.mybatis.mapper.MyBatisMapper;
import com.gil.mybatis.service.MyBatisService;
import com.gil.mybatis.vo.MybatisVo;
import org.springframework.stereotype.Service;

@Service
public class MyBatisServiceImpl implements MyBatisService {


    private MyBatisMapper myBatisMapper;

    public MyBatisServiceImpl() {
    }

    @Override
    public MybatisVo requestTest1() {
        return myBatisMapper.requestTest1();
    }
}
