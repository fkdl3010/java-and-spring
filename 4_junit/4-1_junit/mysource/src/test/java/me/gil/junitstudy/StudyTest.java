package me.gil.junitstudy;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import me.gil.junitstudy.annotation.FastTag;
import me.gil.junitstudy.annotation.FindSlowTestExtension;
import me.gil.junitstudy.annotation.SlowTag;
import me.gil.junitstudy.domain.Study;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.AggregateWith;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;
import org.junit.jupiter.params.provider.CsvSource;

@ExtendWith(FindSlowTestExtension.class)
@TestMethodOrder(OrderAnnotation.class)
public class StudyTest {

    // 테스트 마다 StudyTest 인스턴스가 새로 만들어 짐
    // ? 이유: 테스트 마다 의존성을 없애기 위함

    int value = 1;

//    @RegisterExtension
//    static FindSlowTestExtension findSlowTestExtension = new FindSlowTestExtension(1000L);

    @Test
    public void assertTest(){
        String name = "gil";
        assert name.equals("gil2") : printErrorMessage();
        System.out.println(name);
    }

    public static boolean printErrorMessage(){
        System.out.println("print Error Message!");
        return false;
    }

    @Order(2)
    @FastTag
    public void create_unit_test(){
        Study study = new Study(value++);
        System.out.println(value);
        assertThat(study.getLimitCount()).isGreaterThan(0);
    }

    @Order(1)
    @Test
//    @Tag("tagTest2")
    @SlowTag
    @DisplayName("우선순위")
    public void create1() throws InterruptedException {
        Thread.sleep(1005L);
        System.out.println(value++);
    }

    @Order(3)
    @RepeatedTest(value = 10, name = "{displayName}, {currentRepetition}/{totalRepetitions}")
    @Disabled
    public void repeat_test(RepetitionInfo repetitionInfo){
        System.out.println("repeatTest");
        System.out.println("repetitionInfo.getCurrentRepetition() = " + repetitionInfo.getCurrentRepetition());
        System.out.println("repetitionInfo.getTotalRepetitions() = " + repetitionInfo.getTotalRepetitions());
    }

    @Order(4)
    @ParameterizedTest(name = "{displayName}, index={index}, " + ParameterizedTest.DEFAULT_DISPLAY_NAME)
    @CsvSource(value = {"10, '자바 스터디'", "20, 스프링"})
    @Disabled
    public void repeat_test2(@AggregateWith(StudyAggregator.class) Study study){
        System.out.println("study.toString() = " + study.toString());
    }

    static class StudyAggregator implements ArgumentsAggregator{

        @Override
        public Object aggregateArguments(ArgumentsAccessor argumentsAccessor, ParameterContext parameterContext) throws ArgumentsAggregationException {
            return new Study(argumentsAccessor.getInteger(0), argumentsAccessor.getString(1));
        }
    }

    static class StudyConverter extends SimpleArgumentConverter {

        @Override
        protected Object convert(Object o, Class<?> aClass) throws ArgumentConversionException {
            assertEquals(Study.class, aClass);
            System.out.println("o.toString() = " + o.toString());
            return new Study(Integer.parseInt(o.toString()));
        }
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("Before each");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each");
    }

    public static boolean test(){
        System.out.println("execute");
        return true;
    }

    public static void main(String[] args) {

        if("test".equals("test") && 1 > 0 ? test() : null){
            System.out.println("depthTest");
        }
    }
}