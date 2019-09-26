package com.example.springboot.util;

import org.apache.commons.collections4.map.MultiKeyMap;

/**
 * @author Archer
 * @date 2019-09-03
 */
public class MultiKeyMapTest {
    public static void main(String[] args) {
        /**
         * 多key map
         */
        MultiKeyMap<String, String> multiKeyMap = new MultiKeyMap();
        multiKeyMap.put("sadf", "asfddsf", "asfsdaffdsf", "value1");
        String x = multiKeyMap.get("sadf", "asfddsf", "asfsdaffdsf");
        System.out.println(x);
    }
}
