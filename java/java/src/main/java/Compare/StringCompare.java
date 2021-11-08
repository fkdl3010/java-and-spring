package Compare;

public class StringCompare {

    public static void main(String[] args) {

        String str = "abcd";

        // 1) 비교대상에 문자열이 포함되어있을 경우
        System.out.println( str.compareTo("abcd") ); // 0 (같은 경우는 숫자나 문자나 0을 리턴)
        System.out.println( str.compareTo("ab") ); // 2
        System.out.println( str.compareTo("a") ); // 3
        System.out.println( str.compareTo("c") ); // -2
        System.out.println( "".compareTo(str) ); // -4

        // 2) 비교대상과 전혀 다른 문자열일 경우
        System.out.println( str.compareTo("zefd") ); // -25
        System.out.println( str.compareTo("zEFd") ); // -25
        System.out.println( str.compareTo("ABCD") ); // 32

    }
}
