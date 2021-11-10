package com.gil.testexception.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionDto {

    int id;
    String name;
    int age;
    static int 나이 = 0;

    @Override
    public String toString() {
        return "ExceptionDto{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", age=" + age +
            '}';
    }

    public void yourName(){
        System.out.println(name);
    }

    public static void 기본아이템(){
        System.out.println("6069069239423492340909");
        System.out.println("기본아이템");
    }


}
