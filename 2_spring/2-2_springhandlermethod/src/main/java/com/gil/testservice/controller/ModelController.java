package com.gil.testservice.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ModelController {

    @GetMapping(value = "/")
    public String goToIndex() {
        System.out.println("123");
        return "index";
    }

    @GetMapping(value = "/test")
    public String test() {
        System.out.println("123");
        return "model/model";
    }

    //    @ResponseBody
    @RequestMapping(value = "/model", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Map<String, Object>> modelTest(@RequestBody Map<String, Object> map) {
        System.out.println("123");
        return new ResponseEntity<>(map, HttpStatus.OK);
    }


}
