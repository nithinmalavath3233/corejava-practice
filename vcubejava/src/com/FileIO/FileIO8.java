
package com.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO8 {

    public static void main(String[] args)
            throws FileNotFoundException {

        System.out.println("main method started");

        File f = new File(
            "C:\\vscode projects\\ioexception\\FileIo\\hello.txt"
        );

        Scanner sc = new Scanner(f);
        while(sc.hasNext()) {
        	System.out.println(sc.nextLine());
        }

        System.out.println("main method ended");

        sc.close();
    }
}
