package com.gil.mybatis.service.impl;

import com.gil.mybatis.mapper.MyBatisMapper;
import com.gil.mybatis.service.MyBatisService;
import com.gil.mybatis.vo.MybatisVo;
import org.springframework.stereotype.Service;

@Service
public class MyBatisServiceImpl implements MyBatisService {


    private final MyBatisMapper myBatisMapper;

    public MyBatisServiceImpl(MyBatisMapper myBatisMapper) {
        this.myBatisMapper = myBatisMapper;
    }

    @Override
    public MybatisVo requestTest1() {
        return myBatisMapper.requestUser();
    }
}
