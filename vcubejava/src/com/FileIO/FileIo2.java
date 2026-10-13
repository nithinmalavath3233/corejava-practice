
package com.FileIO;

import java.io.File;
import java.io.IOException;

public class FileIo2 {

    public static void main(String[] args) throws IOException {

        System.out.println("main method started");

        // Create a directory
        File f = new File("C:\\vscode projects\\ioexception\\MyFolder");

        boolean flag = f.mkdir();

        if (flag) {
            System.out.println("Created a new directory or folder");
        } else {
            System.out.println("Something went wrong or folder already exists");
        }

        // Create a file inside the directory
        File f1 = new File(f, "nithin.txt");

        try {
            if (f1.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Check file permissions
        System.out.println("Can execute: " + f1.canExecute());
        System.out.println("Can read: " + f1.canRead());
        System.out.println("Can write: " + f1.canWrite());
        //System.out.println(f1.getAbsolutePath());
        System.out.println(f1.getCanonicalPath());
        System.out.println(f1.getFreeSpace());
        System.out.println(f1.getTotalSpace());
        File f2= new File("C:\\vscode projects\\webdevlopment\\html");
        System.out.println("main method ended");
        String[] files=f2.list();
          int count=0;
          for(String filename:files) {
        	  System.out.println(filename);
        	  count++;
        	  
          }
          System.out.println("total files:"+count);
          System.out.println("total Files:"+files.length);
    }
}
