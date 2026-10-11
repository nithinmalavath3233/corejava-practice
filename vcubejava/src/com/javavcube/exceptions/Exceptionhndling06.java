package com.javavcube.exceptions;
import java.io.File;
import java.io.IOException;

public class Exceptionhndling06 {
  
	public static void main(String[] args)throws IoException {
		System.out.println("main method started");
		File f=new File("C:\\vscode projects\\ioexception\\nithin1233.txt");
		
		try {
	    boolean status=f.createNewFile();
	    if(status) {
	    	System.out.println("the file has been created succcessfully");
		}
		else{
			System.out.println("Something went wrong!!");
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
       
		System.out.println("main method ended");
	}
	

}
