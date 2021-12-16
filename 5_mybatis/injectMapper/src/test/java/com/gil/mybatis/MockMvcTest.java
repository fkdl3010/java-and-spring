package com.gil.mybatis;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import com.gil.mybatis.controller.MyBatisController;
import com.gil.mybatis.mapper.MyBatisMapper;
import com.gil.mybatis.service.impl.MyBatisServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.filter.CharacterEncodingFilter;

@ExtendWith({MockitoExtension.class, SpringExtension.class})
@ContextConfiguration(value = {
    "file:web/WEB-INF/spring/applicationContext.xml",
    "file:web/WEB-INF/spring/servlet-context.xml",
    "classpath*:config/db/context-datasource.xml"
})
public class MockMvcTest {

    MyBatisController myBatisController;

    @InjectMocks
    MyBatisServiceImpl myBatisService;

    @Mock
    MyBatisMapper myBatisMapper;

    private MockMvc mockMvc;

    @BeforeEach
    public void beforeAll(){
        myBatisController = new MyBatisController(myBatisService);
        mockMvc = MockMvcBuilders.standaloneSetup(myBatisController)
            .addFilter(new CharacterEncodingFilter("UTF-8")).build();
    }

    @Test
    @DisplayName("MockMvc테스트")
    public void mockMvcTest() throws Exception {

        mockMvc.perform(post("/test1"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print());
//        verify(myBatisService, times(1)).requestTest1();
        verify(myBatisMapper, times(1)).requestUser();
    }

}
