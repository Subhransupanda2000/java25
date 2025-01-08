package org.example.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("def.txt");
        String s="hii";
        fos.write(s.getBytes());
        String s1="goodbye";
        byte []b=s1.getBytes();
        fos.write(b);
        fos.flush();
        //----------------------------------------------------------------
        FileInputStream fis=new FileInputStream("def.txt");

        int size= fis.available();
        byte byt[]=new byte[size];
        fis.read(b);
        String s2=new String(b);
        System.out.println(s2);
    }
}
