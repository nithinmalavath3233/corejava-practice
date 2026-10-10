package com.javavcube.exceptions;

public class ExceptionHandling05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("main method started");
      int arr[]=new int[5];
    
      
      try {
    	  arr[0]=10;
          arr[1]=20;
          arr[2]=30;
          arr[3]=40;
          arr[4]=50;
          arr[6]=60; 
      }
      catch(Exception e) {
    	  System.err.println("in catch");
    	  System.out.println(e.getMessage());
      }
      
     for(int i=0;i<arr.length;i++) {
    	 System.out.println(arr[i]);
     }
     System.out.println("main method ended");
	}

}
