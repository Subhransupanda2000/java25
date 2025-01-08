package org.example.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt"));
        bw.write("welcome");
        bw.newLine();
        bw.write("goodbuye");
        char[] ch={'a','b','c','d'};
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
