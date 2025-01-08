package org.example.file;
//
//import java.io.*;
//
//public class Reader {
//    public static void main(String[] args) throws IOException {
//        File file = new File("Dabba.txt");
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.exists());
//        System.out.println(file.isFile());
//        System.out.println(file.delete());
//        System.out.println(file.canWrite());
//        System.out.println(file.canExecute());
//        System.out.println(file.getParent());
//        System.out.println(file.getPath());
//        System.out.println(file.canRead());
//        System.out.println(file.getName());
//        FileWriter fw = new FileWriter("Dabba.txt");
//        fw.write("JavaDeveloper");
//        fw.flush();
//        fw.close();
//        int l = (int) file.length();
//
//        FileReader fr = new FileReader("Dabba.txt");
//        for (int i = 0; i <= l - 1; i++) {
//            System.out.print((char) fr.read());
//        }
//
//
//    }
//}
