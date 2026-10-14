
package com.FileIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;

class Employee implements Serializable {

    String username = "nithin";
    transient String password = "nithin123";
    transient int cvv = 234;
}
public class TestSerializable {

    public static void main(String[] args) {
        Employee emp = new Employee();
        File f = new File("C:\\vscode projects\\ioexception\\FileIo\\nithin.ser");
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(emp);

            System.out.println("Object serialized successfully");

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("main method ended");
    }
}

