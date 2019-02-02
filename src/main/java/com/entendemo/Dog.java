package com.entendemo;

import org.junit.Test;

public class Dog extends Cat{
    @Override
    public void eat() {
        super.eat();
    }

    @Test
    public void test1(){
        eat();

    }
}
