package com.io;

import org.junit.Test;

import java.io.*;
import java.util.Map;

public class IoDemoTest {
    @Test
    //字符流复制
    public void demotest(){
        try {
            FileReader file = new FileReader(new File(IoDemoTest.class.getResource("/a.txt").getPath()));
            try {
                int i=0;
                while ((i=file.read())!=-1) {
                    System.out.print((char)i);
        //            System.out.println((char)i+1/0);
                }
                file.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("无论如何都会被执行");
        }
    }
    @Test
    public void testdemo() throws IOException {
        FileReader read = new FileReader(new File(IoDemoTest.class.getResource("/001.txt").getPath()));
        int j=0;
        while ((j=read.read())!=-1){
            System.out.print((char)j);
        }
        read.close();
    }
    @Test
    public void writer(){
        Map<String,String> getenv = System.getenv();
        for (Map.Entry<String,String> entry:getenv.entrySet()) {
            System.out.println("key的值是"+entry.getKey());
            System.out.println("value的值是"+entry.getValue());

        }
    }

    @Test
    public void demowhile(){
        String pew =System.getenv("PWD");
        System.out.print(pew);

            File writer = new File(pew+"/src/main/java/resources/b.txt");
            if (!writer.exists()){
                try {
                    writer.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }else {
                try {
                    FileWriter writer1 = new FileWriter(writer);
                    writer1.write("今天天气挺好\n");
                    writer1.flush();

                    writer1.write("爱你一万年");
                    writer1.flush();
                    writer1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

    }
}
