package com.workspace;

import org.junit.Test;

public class IfWorkBase {

    @Test
    public void base001(){
        int a=1;
        if (a>=2){
            System.out.println("输入正确");
        }else{
            System.out.println("输入错误");
        }

    }
    @Test
    public void base002(){
        int b=2;
        if (b!=2){
            System.out.println(b);

        }else if(0<b & b<2){
            System.out.println(b+1);
        }else{
            System.out.println(b-1);
        }

    }
    @Test
    public void base003(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }
    @Test
    public void base004(){
        int c=2;
        while (c>2){
            System.out.println(c);
            c++;
        }
    }
    @Test
    public void base005(){
        int x=9;
        do {
            System.out.println(x);
            x--;
        }while (x>1);
    }
}
