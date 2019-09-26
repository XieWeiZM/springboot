package com.example.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Create By Stream Wind On 2019-06-19
 */
public class FunctionTes {

    public static void main(String[] args) {

//        Function<Integer, Integer> a = x -> x+1;
//        Function<Integer, Integer> b = x -> x*5;
//
//        System.out.println(a.apply(2));
//        System.out.println(a.compose(b).apply(2));
//        System.out.println(a.andThen(b).apply(2));



        List<Integer> list = new ArrayList<>();

        List<String> listDate = getlist((Integer e) -> e.toString(), (String f) -> f+"nihao", Arrays.asList(11,2,3));


        System.out.println(listDate);

        Consumer<Integer> consumer = a -> System.out.println(a+1);

        consumer.accept(3);
    }

    public  static <T,R> List<R> getlist(Function<T,R>function1,Function<R,R>function2, List<T> date) {

       return date.stream().map(function1.andThen(function2)).collect(Collectors.toList());

    }
}
