package com.FileIO;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;



public class FileIO5 {

	public static void main(String[] args) throws IOException{
		System.out.println("main method started");
		FileWriter fw= new FileWriter("C:\\vscode projects\\ioexception\\FileIo\\java123.txt");
		
	     BufferedWriter bw = new BufferedWriter(fw);
		bw.write("java is simple");
		bw.newLine();
		bw.write("java is secure");
		bw.newLine();
		bw.write("java is Dynamic");
		bw.flush();
		System.out.println("main method ended");
		

	}

	

}
