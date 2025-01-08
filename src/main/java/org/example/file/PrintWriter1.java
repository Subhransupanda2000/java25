package org.example.file;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

import java.io.IOException;

public class PrintWriter1 {

    public static void main(String[] args) throws IOException {
        File f=new File("ajs.txt");
        f.createNewFile();
        FileWriter fw=new FileWriter("ajs.txt");
        PrintWriter pw=new PrintWriter(fw);
        pw.write("abjhg");
        pw.println("hello");
        pw.write("bye");
        System.out.println(f.getAbsolutePath());
        pw.flush();
        pw.close();


    }
}

