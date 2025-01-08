package org.example.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("abc.txt", true);
        fw.write("hii");
        char[] arr = {'q', 'b'};
        fw.write(arr);
        fw.write("haran\nsoftware solutions");
        fw.write("\n");
        fw.write("hii");
        fw.flush();
        fw.close();
    }
}
// Main problem with this is to erite line separeteor explicitly