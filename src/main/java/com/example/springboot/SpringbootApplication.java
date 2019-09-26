package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SpringBootConfiguration
//@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class SpringbootApplication {


//    static void test() throws InterruptedException {
//
//        while (true){
//
//            System.out.println(getStr());
//
//            Thread.sleep(1000);
//
//        }
//
//    }
//
//
//    static int getStr(){
//
//        return new Random().nextInt(10);

//    }

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(SpringbootApplication.class, args);



//
//        test();

    }


}
