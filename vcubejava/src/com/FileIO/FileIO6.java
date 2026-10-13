
package com.FileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileIO6 {

    public static void main(String[] args) {

        System.out.println("main method started");

        try (PrintWriter pw = new PrintWriter("C:\\vscode projects\\ioexception\\FileIo\\crickiet124.txt")) {

            pw.println("India");
            pw.println(200);
            pw.println("England");
            pw.println(500);
            pw.println(123.7);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("main method ended");
    }
}

