package org.example.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new FileReader("abc.txt"));
        String line=bf.readLine();
        while (line!=null)
        {
            System.out.println(line);
            line=bf.readLine();
        }
    }
}
