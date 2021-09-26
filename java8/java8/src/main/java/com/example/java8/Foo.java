package com.example.java8;

import com.example.extendsTest.Child;
import com.example.extendsTest.Parent;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Foo {

    public static void main(String[] args) {

//        Function<Integer, Integer> plus10 = (number) -> {
//            return number + 10;
//        };
//        UnaryOperator<Integer> plus20 = number -> { return number + 20;};
//
//        System.out.println(plus20.apply(1));
        
//        Function<Integer, Integer> multiply2 = i -> i * 2;
//
//        System.out.println(plus10.andThen(multiply2).apply(2));

//        BiFunction<Integer,Integer,String> numberToString = (n,n2) -> {
//            return "hi" + n + n2;
//        };
//
//        System.out.println(numberToString.apply(1,2));

//        Consumer<Integer> exportNumber = (i) -> System.out.println("i = " + i);
//        exportNumber.accept(1);

//        Supplier<Integer> get10 = () -> 10;
//
//        System.out.println(get10.get());

//        Predicate<Function<Integer, Integer>> startsWithSangGil = (f) -> {
//            return f.apply(1) == 11;
//        };
//
//        System.out.println(startsWithSangGil.test(plus20));

        BinaryOperator<String> exportString = (name, job) -> {
            return name + job;
        };

        System.out.println(exportString.apply("sangGil","developer"));


    }

}
