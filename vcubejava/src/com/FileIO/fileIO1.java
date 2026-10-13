package com.FileIO;
import java.io.File;
import java.io.IOException;


public class fileIO1 {

	public static void main(String[] args) {
		System.out.println("main methood started");
		File f=new File("C:\\vscode projects\\ioexception\\FileIO\\student12.txt"  );
	
		try {
			System.out.println("in try block");
		   if(!f.exists()) {
			boolean flag=f.createNewFile();
			if(flag) {
				System.out.println("file has been created sucessfully");
			}
			else {
				System.out.println("something went wrong ");
			}
			
			
		}
		   else{
			System.out.println("with this  name file  already exists");   
		   }
		   }
		catch(IOException e) {
			System.out.println("in catch");
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("main method ended");
		
	}

}
