package com.example.springboot.service;

import com.example.springboot.dto.ConverMapper;
import com.example.springboot.dto.TestVo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Archer
 * @date 2019-07-29
 */
public class DtoTest {

    public static void main(String[] args) {

        List a = new ArrayList();
        a.add(TestVo.builder().goodsName("adada").goodsNumber(1212).build());
        a.add(TestVo.builder().goodsName("212").goodsNumber(322).build());
        a.add(TestVo.builder().goodsName("434").goodsNumber(3455).build());
        Map<String,String> aaa = new HashMap<>();
        aaa.put("adada", "bbbbbbb");
        System.out.println(ConverMapper.INSTANCE.converVoToDo(TestVo.builder().goodsName("adada").goodsNumber(1212).build(), aaa));
        System.out.println(ConverMapper.INSTANCE.converVoToDos(a));
    }
}
