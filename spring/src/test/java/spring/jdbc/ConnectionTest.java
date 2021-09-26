package spring.jdbc;

import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConnectionTest {

    @BeforeAll
    public static void createConnection(){

    }

    @Test
    @DisplayName("커넥션 테스트")
    public void connectionTest(){
        assertDoesNotThrow(() -> {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gil", "root", "1111");
        });
    }

    @AfterAll
    public static void closeConnection(){

    }

}