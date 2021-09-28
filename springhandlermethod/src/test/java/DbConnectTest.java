import static org.mockito.Mockito.when;
import com.gil.testexception.domain.repository.ExceptionDao;
import com.gil.testexception.dto.ExceptionDto;
import java.util.Map;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;

import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class DbConnectTest {

    @Mock
    ExceptionDao exceptionDao;

    static ExceptionDto exceptionDto;


    @BeforeAll
    public static void beforeAll(){
        exceptionDto = new ExceptionDto();
        exceptionDto.setAge(10);
        exceptionDto.setId(1);
        exceptionDto.setName("gil");
    }

    @Test
    public void selectTest(){

        when(exceptionDao.selectSpecificMember("gil")).thenReturn(exceptionDto);
        ExceptionDto exceptionDto1 = exceptionDao.selectSpecificMember("gil");
        System.out.println(exceptionDto1.toString());
    }

    @Test
    public void insertTest(){

        exceptionDao.insertTest(exceptionDto);
    }

    @RepeatedTest(value = 50)
    public void repetedTest(){

        for (int i = 0; i < 10; i++) {
             int test = (int)(Math.random() * 41 ) + 10;
            System.out.println(test);

        }
    }

}
