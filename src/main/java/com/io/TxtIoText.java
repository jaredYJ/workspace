package com.io;

import org.junit.Test;

import java.io.*;

public class TxtIoText {
    private FileReader fr;
    {
        try{
            fr = new FileReader(new File(TxtIoText.class.getResource("/002.txt").getPath()));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }


    private FileWriter fw = null;




    @Test
    public void copy()throws Exception{
        String copy = System.getenv("PWD")+"/src/main/java/resources/copy.txt";
        File file = new File(copy);

        if (!file.exists()){
            file.createNewFile();
            charactorCopy(file);
            fw.close();
            fr.close();

        }else {
            charactorCopy(file);
            fw.close();
            fr.close();

        }
    }

    public void charactorCopy(File file)throws Exception {
        fw=new FileWriter(file);
        int i =0;
        while ((i=fr.read())!=-1){
            fw.write((char)i);
            fw.flush();

        }
    }

    @Test
    public void test1()throws Exception{
        fw = new FileWriter(new File(System.getenv("PWD")+"/src/main/java/resources/copy.txt"),true);
        fw.write("\n");
        fw.flush();

        fw.write("添加一行");
        fw.flush();
        fw.close();


    }
}
