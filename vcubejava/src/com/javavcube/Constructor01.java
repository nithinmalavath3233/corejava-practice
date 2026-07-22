package com.javavcube;

public class Constructor01 {
	int  empId;
	String ename;
	double salary;
	
	Constructor01(int empId,String ename, double salary){
		       this.empId=empId;
		      this.ename=ename;
		      this.salary=salary;
		      
	}
	Constructor01 (){
		empId=102;
		ename="hemanth";
		salary=30000;
		
	}

	public static void main(String[] args) {
		System.out.println("main method started:");
		Constructor01 e1= new Constructor01(101,"vishnu",25000);
	      e1.show();
		Constructor01 e2= new Constructor01();
		   e2.show();


	}
	void show() {
		System.out.println("employee Id:"+empId);
		System.out.println("employee name:"+ename);
		System.out.println("employee salary:"+salary);
		System.out.println("*************************************************************************************");
	}

}
