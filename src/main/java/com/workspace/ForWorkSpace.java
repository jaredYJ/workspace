package com.workspace;

import org.junit.Test;

public class ForWorkSpace {
    @Test
    public void test001(){
        for (int i = 1; i <10 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+i*j+" ");

            }
            System.out.println();

        }
    }

    @Test
    public void test002(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            };
            System.out.println();

        }
    }

    @Test
    public void test003(){
        for (int i = 10; i >1 ; i--) {
            for (int j = 1; j <i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    /**
     * 等腰三角形
     */

    @Test
    public void test004(){
        int max =10;
        for (int i = 1; i <=max ; i++) {
            for (int j = 1; j<=max-i;j++) {
                System.out.print(" ");
            }
            for (int k = 1; k<=2*i-1;k++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
