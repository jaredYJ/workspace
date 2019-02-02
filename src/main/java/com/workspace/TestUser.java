package com.workspace;

import org.junit.Test;

import java.util.Arrays;

public class TestUser {
    private String name;
    private int age;
    private int height;
    private String[] aihao;


    public TestUser(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestUser{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", aihao=" + Arrays.toString(aihao) +
                '}';
    }
    public void speaktest(){
        System.out.println("早起心情好");

    }

    public String speak (String name){
        return "早晨"+name;
    }
    public String speak1(String name,int age){
        return "姓名是" +name+"年龄是"+age;
    }

    public TestUser(String name, int age, int height, String[] aihao) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.aihao = aihao;


    }

    public TestUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String[] getAihao() {
        return aihao;
    }

    public void setAihao(String[] aihao) {
        this.aihao = aihao;
    }
}
