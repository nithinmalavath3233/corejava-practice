package com.javavcube;

public class Quiz {
	String subject;
	int totalQ;
	int totaltime;
	Quiz(){
		System.out.println("no arg constructor called");
		this("maths",30);
		
	}
	Quiz(String subject,int totalQ){
		this(subject,totalQ,60);
	}
	Quiz(String subject, int total,int totaltime){
		this.subject=subject;
		this.totalQ=total;
		this.totaltime=totaltime;
	}
	void show() {
		System.out.println("subject name:"+subject);
		System.out.println("total questions:"+totalQ);
		System.out.println("totaltime:"+totaltime);
	}
	public static void main(String[] args) {
		Quiz q1=new Quiz();
		q1.show();
		

	}

}
