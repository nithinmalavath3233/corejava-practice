package com.javavcube;

public class Employee {
     protected void finalize(){
    	  System.out.println("object is destoryed from heap memory");
    	  
      }

	public static void main(String[] args) {
		System.out.println("main mehod started");
		Employee emp1 =new Employee();
		System.out.println(emp1);
		Employee emp2=new Employee();
		System.out.println(emp2);
		
		
		//emp1=null;
		//emp2=null;
		emp1=emp2;
		
		
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		new Employee();
		
		System.gc();
		
		
		
		//System.out.println(System.gc());
		
		
	   
		

	}

}
