package org.example.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
// Using this filereader we can read chracter data from file.
//        FileReader fd = new FileReader("abc.txt");
//        int i = fd.read();
//        while (i != -1) {
//            System.out.println((char) i);
//            i = fd.read();
//        }
        //---------------------------
        File f = new File("abc.txt");
        FileReader fd = new FileReader(f);


        char[] ch = new char[(int) f.length()];
        fd.read(ch);
        for(char ch1:ch)
        {
            System.out.print(ch1);
        }


    }
}
/*
1.While writing data by FileWriter compulsory we should insert line separator(\n)
manually which is a bigger headache to the programmer.
2. While reading data by FileReader we have to read character by character
instead of line by line which is not convenient to the programmer.
3. To overcome these limitations we should go for BufferedWriter and
BufferedReader concepts.
*/


