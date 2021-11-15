package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@Configuration
@ComponentScan("spring.di")
public class AppConfig {

    @Bean
    public Exam exam(){
        return new NewlecExam();
    }
}