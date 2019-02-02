package com.workspace;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoArraryTest {
    @Test
    public void demo1(){
        int[] intArr = new int[3];
        for (int a:intArr) {
            System.out.println(a);

        }

    }
    @Test
    public void demo2(){
        int[] intArr1 = new int[]{1,2,3,4,5,6,7};
        for (int b:intArr1) {
            System.out.println(b);
        }
    }
    @Test
    public void demo3(){
        String [] strings = {"jared","test","homeworld"};
        System.out.println(strings[2]);
        for (String x:strings) {
            System.out.println(x);

        }
     }
     @Test
    public void demo4(){
        Object [] objects = {"test","1","amd","#^$^&^$^&","xms"};
         System.out.println(objects.length);
         for (Object ay:objects) {
             System.out.println(ay);

         }
     }
     @Test
    public void demo5(){
         String [] strings1 = {"jared","test","homeworld","test1"};
         System.out.println("排序前");
         Arrays.sort(strings1);
         for (String xn:strings1) {
             System.out.println(xn);

         }
         System.out.println(Arrays.binarySearch(strings1,"jared"));
//         System.out.println("排序后");
//         for (String xm:strings1) {
//
//             System.out.println(xm);
//
//         }
     }

     @Test
    public void demo6(){
         ArrayList<String> arrayList = new ArrayList<>();
         arrayList.add("test1");
         arrayList.add("Jared");
         arrayList.add("mytest");
         for (String x:arrayList
              ) {
             System.out.println(x);

         };
     }
}
