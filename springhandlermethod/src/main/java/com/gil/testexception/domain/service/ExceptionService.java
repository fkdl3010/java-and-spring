package com.gil.testexception.domain.service;

import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;

public interface ExceptionService {

    public Map<String, Object> selectTest();

    void insertTest(ExceptionDto exceptionDto);
}
