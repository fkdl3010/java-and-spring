package com.gil.testexception.domain.service.impl;

import com.gil.testexception.domain.repository.ExceptionDao;
import com.gil.testexception.domain.service.ExceptionService;
import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionServiceImple implements ExceptionService {

    @Autowired
    private ExceptionDao exceptionDao;

    @Override
    public Map<String, Object> selectTest() {
        return exceptionDao.selectTest();
    }

    @Override
    public void insertTest(ExceptionDto exceptionDto) {
        exceptionDao.insertTest(exceptionDto);
    }
}
