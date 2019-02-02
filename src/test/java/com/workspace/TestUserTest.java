package com.workspace;

import org.junit.Test;

import static org.testng.Assert.*;

public class TestUserTest {
    @Test
    public void test(){
        TestUser testUser = new TestUser();
        testUser.setName("jared");
        testUser.setAge(88);
        System.out.println(testUser);

        String [] paobu = {"paobu","qitiao"};
        TestUser testUser1 = new TestUser("Jared",18,22,paobu);
        System.out.println(testUser1);

        testUser.speaktest();
        String str =testUser.speak("说普通话");
        System.out.println(str);
        String tste = testUser.speak1("Jared",18);
        System.out.println(tste);
    }

}