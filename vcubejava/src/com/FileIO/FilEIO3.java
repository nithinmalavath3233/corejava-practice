
package com.FileIO;

import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class FilEIO3 {

    public static void main(String[] args) throws IOException {

        System.out.println("main method started");

        File f = new File("C:\\vscode projects\\ioexception\\FileIo\\student.txt");

        try (FileReader fr = new FileReader(f)) {

            int i = fr.read();

            while (i != -1) {
                System.out.print((char) i);
                i = fr.read();
            }
        }

        System.out.println("main method ended");
    }
}
