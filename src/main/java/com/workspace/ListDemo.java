package com.workspace;

import org.junit.Test;

import java.util.*;

public class ListDemo {
    @Test
    public void listdemotest() {

        long start = System.currentTimeMillis();
        ArrayList<Object> arrayList = new ArrayList<>();
        for (int i=0;i<10000000;i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
    @Test
    public void listdemotest1(){

        long start = System.currentTimeMillis();
        LinkedList<Object> linkedList = new LinkedList<>();
        for (int i=0;i<10000000;i++){
            linkedList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
    @Test
    public void strdemo(){
        HashSet hashSet = new HashSet();
        hashSet.add("test");
        hashSet.add("test1");
        hashSet.add("test2");
        hashSet.add("test3");
        hashSet.add("test4");


        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for (Object z:hashSet
             ) {
            System.out.println(z);

        }


    }
}
