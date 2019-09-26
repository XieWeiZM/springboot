package com.example.springboot.dto;

import com.example.springboot.annotation.Spi;
import lombok.Data;

/**
 * @author Archer
 * @date 2019-07-29
 */
@Data
public class ReflexDto {
    private String name;
    private int age;

    public ReflexDto(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ReflexDto() {
    }

    @Spi("afaf")
    public String getName() {
        return name;
    }
    @Spi("")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
