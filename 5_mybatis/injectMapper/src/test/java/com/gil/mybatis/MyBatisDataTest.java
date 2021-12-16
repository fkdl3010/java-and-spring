package com.gil.mybatis;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import com.gil.mybatis.mapper.MyBatisMapper;
import com.gil.mybatis.mapper.MyBatisMapper2;
import com.gil.mybatis.service.MyBatisService;
import com.gil.mybatis.vo.MybatisVo;
import java.util.Optional;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(value = {
    "file:web/WEB-INF/spring/applicationContext.xml",
    "file:web/WEB-INF/spring/servlet-context.xml",
    "classpath*:config/db/context-datasource.xml"
})
public class MyBatisDataTest {

    @Autowired
    private MyBatisService myBatisService;

    @Autowired
    private ApplicationContext context;

    @Test
    @DisplayName("유저 조회 테스트")
    public void userSelectTest(){
        MybatisVo mybatisVo = myBatisService.requestTest1();
        System.out.println("--------------------------------");
        System.out.println("mybatisVo = " + mybatisVo);
        System.out.println("--------------------------------");

    }

    @Test
    @DisplayName("Mapper 주입 테스트")
    public void mapperInjectTest(){
        assertDoesNotThrow(() -> {
            MyBatisMapper myBatisMapper1 = context.getBean(MyBatisMapper.class);
        }, "MyBatisMapper1 은 null 입니다.");

        assertDoesNotThrow(() -> {
            MyBatisMapper2 myBatisMapper2 = context.getBean(MyBatisMapper2.class);
        }, "MyBatisMapper2 은 null 입니다.");
    }
}
