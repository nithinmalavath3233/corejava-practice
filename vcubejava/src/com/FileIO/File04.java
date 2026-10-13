package com.FileIO;
import java.io.IOException;
import java.io.FileWriter;
public class File04 {

	public static void main(String[] args) throws IOException {
		System.out.println("main method started");
		
		FileWriter fw = new FileWriter("C:\\vscode projects\\ioexception\\FileIo\\student789.txt");
		fw.write(65);
	     fw.write('\n');
		fw.write("N");
	     fw.write('\n');
		fw.write("A");
	     fw.write('\n');
		fw.write("u");
	     fw.write('\n');
		fw.write("@");
		fw.close();
		
		
	
		
		
		System.out.println("main mrhtod ended");
         

	}

}
