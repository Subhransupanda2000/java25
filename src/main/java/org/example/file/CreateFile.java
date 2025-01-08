package org.example.file;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file=new File("abc.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
        //-----------------------------
//        String absolutePath = file.getAbsolutePath();
//        System.out.println("Absolute Path: " + absolutePath);
        //----------------------------------------
        File dir=new File("mydir");

        if(dir.mkdir())
        {
            System.out.println("directory created");
        }
        //------------------------------------------
//        File subdir=new File("mydir","mysubdir");
//        if(subdir.mkdir())
//        {
//            System.out.println("subdirectory created");
//        }
        //---------------------------------------------
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(Arrays.toString(dir.list()));
        System.out.println(file.length());
        System.out.println(file.delete());
    }
}
