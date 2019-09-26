package com.example.springboot.dto;

/**
 * Create By Stream Wind On 2019-05-15
 */
public class B  extends  A{

    public B(){

        System.out.println("2222");
    }

    public void aaaa(){

        super.sayHello();
    }

    public void bbb(){

        sayHello();
    }

    @Override
    public void sayHello() {
        System.out.println("bbb");
    }


    public static void main(String[] args) {

        new B().aaaa();
        new B().bbb();
    }
}
