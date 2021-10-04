package com.gil.mybatis;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import com.gil.mybatis.controller.MyBatisController;
import com.gil.mybatis.service.MyBatisService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

@ExtendWith({MockitoExtension.class})
public class MockMvcTest {

    @InjectMocks
    MyBatisController myBatisController;

    @Mock
    MyBatisService myBatisService;

    private MockMvc mockMvc;

    @BeforeEach
    public void beforeAll(){
        mockMvc = MockMvcBuilders.standaloneSetup(myBatisController)
            .addFilter(new CharacterEncodingFilter("UTF-8")).build();
    }

    @Test
    @DisplayName("MockMvc테스트")
    public void mockMvcTest() throws Exception {

//        Mockito.verify(myBatisService, Mockito.times(1)).requestTest1();


        mockMvc.perform(post("/test1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
    }

}
