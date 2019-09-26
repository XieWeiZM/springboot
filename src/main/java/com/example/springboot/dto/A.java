package com.example.springboot.dto;

/**
 * Create By Stream Wind On 2019-05-15
 */
public class A {
    private String test = "ddsdsdsd";

    A(){
        System.out.println("1111");
    }

    static {

        System.out.println("3333");
    }

    {

        System.out.println("4444");
    }

    public void sayHello(){
        System.out.println("a");
    }
}
