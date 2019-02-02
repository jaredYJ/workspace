package com.workspace;

import org.junit.Test;

public class StringBase extends IfWorkBase{

    JavaBaseTest xs = new JavaBaseTest();


    @Test
    public void test1(){
        String str = new String("Jared_YJ");
        str.toUpperCase();
    }
    @Test
    public void testbase(){
        xs.base1();

    }
    @Test
    public void testbase001 (){
        base001();
        base003();

    }
    @Test
    public void testbase002(){

    }
}
