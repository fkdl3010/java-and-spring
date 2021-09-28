package com.gil.testexception.controller;

import com.gil.testexception.domain.ExceptionBusinessLogic;
import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ExceptionController {

    @Autowired
    private ExceptionBusinessLogic exceptionBusinessLogic;

    @RequestMapping(value = "/testDB")
    public void dbConnectTest(){
        Map<String, Object> stringObjectMap = exceptionBusinessLogic.selectTest();

        System.out.println("test");
    }

    @RequestMapping(value = "/insertTest", method = RequestMethod.GET)
    public void insertTest(){
        ExceptionDto exceptionDto;
        exceptionDto = new ExceptionDto();
        exceptionDto.setAge(10);
        exceptionDto.setId((int) (Math.random() * 10));
        exceptionDto.setName("gil");

        exceptionBusinessLogic.insertTest(exceptionDto);

    }
}
