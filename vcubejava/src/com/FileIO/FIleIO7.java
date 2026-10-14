package com.FileIO;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;


public class FIleIO7 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		FileReader fr = new FileReader("C:\\vscode projects\\ioexception\\FileIo\\crickiet124.txt");
		BufferedReader br = new BufferedReader(fr);
		String s= br.readLine();
		while(s!=null) {
			
			System.out.println(s);
			s=br.readLine();
		}
		    br.close();
		    fr.close();
		
		System.out.println("main method ended");
		
	}

}
