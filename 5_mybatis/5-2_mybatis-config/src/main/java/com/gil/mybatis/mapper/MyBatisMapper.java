package com.gil.mybatis.mapper;

import com.gil.mybatis.vo.MybatisVo;
import com.gil.utils.ApiResult;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBatisMapper {

    MybatisVo requestTest1();
}
