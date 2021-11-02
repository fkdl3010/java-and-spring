package optional;

import java.util.Optional;
import java.util.OptionalInt;

public class GilOptional {

    public static void main(String[] args) {
        String str = "abc";
        java.util.Optional<String> optVal = java.util.Optional.of(str);
        System.out.println(optVal.isEmpty());

        java.util.Optional<String> optVal2 = java.util.Optional.ofNullable(null);
        System.out.println(optVal2.isEmpty());


        // 객체 값 가져오기
        java.util.Optional<String> optVal3 = java.util.Optional.ofNullable("abc");
//        String str1 = optVal3.get();                    // optVal3에 저장된 값을 반환 null 이면 예외발생
        String str2 = optVal3.orElse("");           // optVal3에 저장된 값이 null일 때는, "" 을 반환
        String str3 = optVal3.orElseGet(String::new);       // 람다식 사용 가능 () -> new String()
        String str4 = optVal3.orElseThrow(IllegalArgumentException::new);   // null이면 예외발생

        optionalExam();
    }

    public static void optionalExam(){

//        int[] arr = null;
        int[] arr = new int[0];     // 바람직한 코드 작성법 ( null 방지 )
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt = null;
        java.util.Optional<String> opt = java.util.Optional.empty();
        System.out.println("opt.orElseGet() = " + opt.orElseGet(() -> "test"));
    }

}
