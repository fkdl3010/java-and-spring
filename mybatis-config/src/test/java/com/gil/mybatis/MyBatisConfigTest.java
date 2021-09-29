package com.gil.mybatis;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ExtendWith({MockitoExtension.class})
class MyBatisConfigTest {

    static ApplicationContext context;

    @BeforeAll
    public static void beforeAll(){
        context = new ClassPathXmlApplicationContext("classpath:/config/db/context-datasource.xml");
    }

    @Test
    @DisplayName("db연결테스트")
    public void dbConnectTest(){
        assertDoesNotThrow(() -> {
            BasicDataSource datasource = (BasicDataSource) context.getBean("datasource");
            Connection con = datasource.getConnection();
            System.out.println("con = " + con);
        });

    }

}