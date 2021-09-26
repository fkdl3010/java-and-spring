package com.example.java8;

@FunctionalInterface
public interface Bar {

    static final String NAME = "GIL";

    static final int AGE = 27;


    public void introduceWithRamda(String dump);

    default void sound(){
        System.out.println("ㅋㅋ루삥뽕");
    }

    static void run(){
        System.out.println("한강공원으로 달려");
    }
}
