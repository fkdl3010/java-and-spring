package ex01_Enum;

import java.time.DayOfWeek;

public class Main {

//    private final static int FRUIT_PEACH = 1;
//    private final static int FRUIT_APPLE = 2;
//    private final static int FRUIT_BANANA = 3;

    enum Fruit{ PEACH,APPLE,BANANA}
    enum Company{ GOOGLE,APPLE,ORACLE}

//    // company
//    private final static int COMPANY_GOOGLE = 1;
//    private final static int COMPANY_APPLE = 2;
//    private final static int COMPANY_ORACLE = 3;

    public static void main(String[] args) {
        System.out.println(Fruit.APPLE == Company.APPLE); // 컴파일 에러!!
    }
}