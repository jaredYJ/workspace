package com.workspace;

import org.junit.Test;

import java.util.*;

public class MapDemoTest {
    @Test
    public void maptest(){
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("namd","yanjun");
        hashMap.put("age","18");
        hashMap.put("longer","test");
        hashMap.put("email","yanjun@qq.com");
        hashMap.put("id","1");

        System.out.println(hashMap.get("age"));
        System.out.println(hashMap.isEmpty());
        System.out.println(hashMap.containsKey("id"));
        System.out.println(hashMap.containsValue("19"));
        System.out.println(hashMap.keySet());
        System.out.println(hashMap.size());
        Iterator<String> iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();

            System.out.println("key的值"+key);
            System.out.println("value的值"+hashMap.get(key));
        }
    }

    @Test
    public void linkedtest(){
        LinkedHashMap<String,Object> hashMap = new LinkedHashMap<>();
        hashMap.put("namd","yanjun");
        hashMap.put("age","18");
        hashMap.put("longer","test");
        hashMap.put("email","yanjun@qq.com");
        hashMap.put("id","1");

//        Iterator<String> iterator = hashMap.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//
//            System.out.println("key的值"+key);
//            System.out.println("value的值"+hashMap.get(key));


        /**
         * 第二种遍历方式
         */
        Set<Map.Entry<String,Object>> entries = hashMap.entrySet();
//        for (Map.Entry<String,Object> xy: hashMap.entrySet()) {
        for (Map.Entry xy:entries) {
            System.out.println("key的值"+xy.getKey());
            System.out.println("value的值"+xy.getValue());

        }
        /**
         * 第三种遍历方式
         */
        Set<String> strings = hashMap.keySet();
        for (String st:strings) {
            System.out.println("key的值"+st);

        }
        Collection<Object> values = hashMap.values();
        for (Object va:values) {
            System.out.println("value的值"+va);

        }

    }
}
