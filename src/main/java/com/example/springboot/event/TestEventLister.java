package com.example.springboot.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author Archer
 * @date 2019-08-26
 */
@Component
@Slf4j
public class TestEventLister {

    @EventListener
    @Async
    public void test(TestEvent event){
        log.info("asdsadasd.0.0.0");
        System.out.println("test"+ event.getName() + event.getAge());
    }

    @EventListener
    @Async("myExecutor")
    public void test1(TestEvent event){

        System.out.println("test1"+ event.getName() + event.getAge());
        log.info("test10.0.0.0");
    }

}
