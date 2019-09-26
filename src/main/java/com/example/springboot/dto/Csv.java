package com.example.springboot.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create By Stream Wind On 2019/5/8
 */
public class Csv {
    @JsonProperty("HHH OO")
    private String a;
    @JsonProperty("DDD PP")
    private String b;
    @JsonProperty("LLL pp")
    private String c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
