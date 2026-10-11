package com.javavcube.exceptions;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class IOExceptions {

	public static void main(String[] args) throws IOException {
	     System.out.println("main method started");
	     File f=new File("C:\\vscode projects\\ioexception\\nithin123.txt");
	     FileReader fr=new FileReader(f);
	     int i=fr.read();
	     while(i!=-1) {
	    	  System.out.print((char)i) ;
	    	  i=fr.read();
	     }
	     
	     
         System.out.println("main method ended");
	}

}
