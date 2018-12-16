package com.lzx.java.base.map;

import java.util.LinkedHashMap;

/**
 * Created by liuzhixiong on 2018/12/6.
 */
public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("1", "1");
        linkedHashMap.put("2", "2");
        linkedHashMap.put("3", "3");
        linkedHashMap.put("4", "4");

        System.out.println(linkedHashMap);
    }
}
