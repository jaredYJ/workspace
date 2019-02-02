package com.io;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamTest {
    @Test
    public void demo1()throws Exception{
        FileInputStream stream = new FileInputStream(new File(this.getClass().getResource("/b.txt").getPath()));
        System.out.println((char) stream.read());
    }

    @Test
    public void demo2()throws Exception{
        String path = System.getenv("PWD")+"/src/main/java/resources/copy1.txt";
        File file =new File(path);
        if(!file.exists()){
            file.createNewFile();
            FileOutputStream steam = new FileOutputStream(file);
            String a = "努力学习";
            steam.write(a.getBytes());
            steam.flush();
            steam.close();
        }

    }

    @Test
    //字节流复制
    public void steamTest()throws Exception{
        FileInputStream iput = new FileInputStream(this.getClass().getResource("/a.mp3").getPath());
        String pwd = System.getenv("PWD")+"/src/main/java/resources/steam.mp3";
        File file = new File(pwd);
        if(!file.exists()){
            file.createNewFile();
        }

        FileOutputStream oput = new FileOutputStream(file);
        int len = 0;
        byte[] by=new byte[1024];
        while ((len=iput.read())!=-1){
            oput.write(by,0,len);
            oput.flush();
        }
        oput.close();
        iput.close();
    }
}
