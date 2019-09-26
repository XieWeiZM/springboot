package com.example.springboot.annotation;

import java.lang.annotation.*;

/**
 * @author Archer
 * @date 2019-07-29
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Spi {
    String value() default "";
}
