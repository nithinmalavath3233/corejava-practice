
package com.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

public class DeSerialization {

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {

        System.out.println("main method started");

        File f = new File(
            "C:\\vscode projects\\ioexception\\FileIo\\nithin.ser"
        );

        try (FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            Employee obj = (Employee) ois.readObject();

            System.out.println(obj.username);
            System.out.println(obj.password);
            System.out.println(obj.cvv);
        }

        System.out.println("main method ended");
    }
}

