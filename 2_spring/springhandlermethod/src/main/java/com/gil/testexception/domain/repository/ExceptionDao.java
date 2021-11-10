package com.gil.testexception.domain.repository;

import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;
import org.springframework.stereotype.Repository;

public interface ExceptionDao {

    public Map<String,Object> selectTest();

    public void insertTest(ExceptionDto exceptionDto);

    public ExceptionDto selectSpecificMember(String id);

}
