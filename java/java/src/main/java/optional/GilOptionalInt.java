package optional;

import java.util.Optional;
import java.util.OptionalInt;

public class GilOptionalInt {

    public static void main(String[] args) {
        OptionalInt opt1 = OptionalInt.empty();
        OptionalInt opt2 = OptionalInt.of(0);

        System.out.println("opt1.isEmpty() = " + opt1.isEmpty());   // true
        System.out.println("opt2.isEmpty() = " + opt2.isEmpty());   // false
        System.out.println("opt2.equals(opt1) = " + opt2.equals(opt1)); // false
    
    }



}
