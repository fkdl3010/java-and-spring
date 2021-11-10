package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class GilOptional {

    public static void main(String[] args) {
        String str = "abc";
        Optional<String> optVal = Optional.of(str);
        System.out.println(optVal.isEmpty());

        Optional<String> optVal2 = Optional.ofNullable(null);
        System.out.println(optVal2.isEmpty());


        // 객체 값 가져오기
        Optional<String> optVal3 = Optional.ofNullable("abc");
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
        Optional<String> opt = Optional.empty();
        System.out.println("opt.orElseGet() = " + opt.orElseGet(() -> "test"));

        Optional<Optional<String>> test = Optional.of(Optional.of("test123"));

        Optional<String> s = test.flatMap(x -> Optional.of(x.get()));
        Optional<Optional<String>> s1 = test.map(x -> Optional.of(x.get()));
        Optional<String> s2 = test.map(x -> x.get());

    }

}
