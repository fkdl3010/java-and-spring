package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalPractice {

    public static void main(String[] args){
        Optional<String> optStr = Optional.of("abcde");
        Optional<Integer> optInt = optStr.map(String::length);
//        Optional<Integer> optInt2 = optStr.map( (x) -> x.length());
        System.out.println("optStr = " + optStr.get());
        System.out.println("optInt.get() = " + optInt.get());

        int result1 = Optional.of("123")
                            .filter( x -> x.length() > 0)
                            .map(Integer::parseInt)
                            .get();

        int result2 = Optional.of("")
                            .filter( x -> x.length() > 0)
                            .map(Integer::parseInt)
                            .orElse(-1);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);

        Optional.of("456").map(Integer::parseInt)
                            .ifPresent(x -> System.out.printf("result3 = %d%n", x));

        OptionalInt optInt1 = OptionalInt.of(0);    // 0을 저장
        OptionalInt optInt2 = OptionalInt.empty();  // 빈 객체를 저장

        System.out.println(optInt1.isPresent());
        System.out.println(optInt2.isPresent());

        System.out.println("-------");

        List<Optional> test = new ArrayList(Arrays.asList(Optional.of("123"),Optional.of("456"),Optional.of("789")));
        for (Optional optional : test) {
            System.out.println(optional);
            Stream stream = optional.stream();
            stream.forEach(x -> System.out.println("x instanceof String = " + x instanceof String));
            System.out.println(optional);
        }

        System.out.println("-----");
    }


}
