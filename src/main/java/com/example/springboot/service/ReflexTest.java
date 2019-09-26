package com.example.springboot.service;

import com.example.springboot.annotation.Spi;
import com.example.springboot.dto.ReflexDto;
import com.example.springboot.dto.TestVo;
import lombok.val;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Archer
 * @date 2019-07-29
 * 学习反射
 */
public class ReflexTest {

    private static TestVo string;
    private static Integer a;
    private static AtomicInteger atomicInteger;

    public static void useSpi(Class type) {
        Method[] declaredMethods = type.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            Spi annotation = declaredMethod.getAnnotation(Spi.class);
            if (annotation != null && !StringUtils.isEmpty(annotation.value())) {
                System.out.println(annotation.value()+"------");
            } else {
                System.out.println(declaredMethod.getName());
            }
        }
    }

    public static void main(String[] args) {
        boolean check = true;
        if (!check) {
            System.out.println(111);
        }
        if (Optional.of(check).isPresent()) {

        }
        a = new Integer(2);
        atomicInteger = new AtomicInteger(1);
        val i = new Integer(121212);
        string = TestVo.builder().build();
        System.out.println(i.getClass());
        useSpi(ReflexDto.class);
        return ;
    }


}
