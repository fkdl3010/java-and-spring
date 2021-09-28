package com.gil.testexception.domain;

import com.gil.testexception.domain.service.ExceptionService;
import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExceptionBusinessLogic {

    @Autowired
    private ExceptionService exceptionService;

    public Map<String, Object> selectTest() {
        return exceptionService.selectTest();
    }

    public void insertTest(ExceptionDto exceptionDto) {
        exceptionService.insertTest(exceptionDto);
    }
}
