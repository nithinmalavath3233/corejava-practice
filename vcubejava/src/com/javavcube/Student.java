package com.javavcube;

public class Student {
	
	int id;
	String StudentName;
	String Course;
	Student(){
		this(1, "charan");
		
	}

	public Student(int id, String StudentName) {
		this(id,StudentName,"JFS");
		
	}

	public Student(int id, String StudentName, String Course) {
		this.id=id;
		this.StudentName=StudentName;
		this.Course=Course;
		
		
		
	}

	public static void main(String[] args) {
		Student s1=new Student();
		s1.show();
		
		Student s2=new Student(2,"vijay");
		s2.show();
		
	
	}
	void show() {
		System.out.println("student id:"+id);
		System.out.println("student name:"+StudentName);
		System.out.println("student course:"+Course);
		System.out.println("************************************************");
		
	}

}
