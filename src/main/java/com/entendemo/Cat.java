package com.entendemo;

import org.junit.Test;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫是软体动物");
    }


    @Test
    public void test(){
        eat();
        running();
        age=19;
        mook="testcat";
    }
}
