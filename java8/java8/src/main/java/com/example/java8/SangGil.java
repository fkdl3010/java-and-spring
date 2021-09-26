package com.example.java8;

public class SangGil implements Bar{

    public int birth = 1995;

    @Override
    public void introduceWithRamda(String dump) {

    }

    @Override
    public void sound() {
        Bar.super.sound();
    }

    public void test(){
        System.out.println("구현객체의 메소드 테스트");
    }
}
