package com.example.springboot;

import com.example.qnyspringbootstarter.service.HttpClient;
import com.example.springboot.event.TestEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootApplicationTests {

//    @Autowired
//    private RedissonClient redissonClient;
//
//
//
//    @Test
//    public void set() {
//        // 设置字符串
//        RBucket<String> keyObj = redissonClient.getBucket("k1");
//        System.out.println(keyObj.get());
//        keyObj.set("v1237");
//    }
    @Autowired
    //自己封装的 starter 服务
    private HttpClient httpClientl;

    @Resource
    private ApplicationContext applicationContext;

    @Test
    public void test(){
        System.out.println(httpClientl.getHtml());
    }


    @Test
    public  void  testEvent(){
        applicationContext.publishEvent( TestEvent.builder().age(111).name("fdsfsa").build());

    }


}
