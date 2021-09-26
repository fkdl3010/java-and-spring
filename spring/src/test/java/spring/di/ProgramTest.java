package spring.di;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.di.entity.Exam;
import spring.di.ui.ExamConsole;

class ProgramTest {

    private static final ApplicationContext context = new ClassPathXmlApplicationContext("classpath:setting.xml");

    @Test
    @DisplayName("null 테스트")
    public void isNotNull(){
        ExamConsole console = context.getBean("console", ExamConsole.class);
        assertAll(() -> {
            assertNotNull(console);
            assertNotNull(console.getExam());
            assertTrue(console.getExam() instanceof Exam);
        });
        System.out.println(console.getExam().toString());
    }


}