package com.workspace;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsTest {
    @Test
    public void collectionsdemo(){
        ArrayList<String> list1 =new ArrayList<>();
        list1.add("testt1");
        list1.add("testt2");
        list1.add("testt3");
        list1.add("testt4");
        list1.add("testt5");
        System.out.println("reverse前");
        for (String coll:list1) {
            System.out.println(coll);

        }
        System.out.println("===============");
        System.out.println("resverse后");
        Collections.reverse(list1);
        for (String coll:list1) {
            System.out.println(coll);

        }
    }
}
