package com.oops;

public class Emp_encapsulation {

	public static void main(String[] args) {
		Employee_Encapsulation emp1=new Employee_Encapsulation ();
		emp1.setId(12);
		emp1.setName("kiran");
		emp1.setSalary(80000);
		emp1.setPassword("585032iruddA");
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getPassword());
		
	}

}