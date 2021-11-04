package com.example.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Optional;

public class Test {

    @org.junit.jupiter.api.Test
    public void test() {
        assertEquals(Optional.of(Optional.of("STRING")),
            Optional.of("string").map(s -> {
                    return Optional.of("STRING");
                }));

        assertEquals(Optional.of("STRING"),
            Optional.of("string").flatMap(s -> {
                    return Optional.of("STRING");
                }));




        Optional<Optional<String>> s1 = Optional.of("string").map(s -> {
            return Optional.of("STRING");
        });

        Optional<String> s2 = Optional.of("string").flatMap(s -> {
                return Optional.of("STRING");
            });
    }


}
