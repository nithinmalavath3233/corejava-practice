package com.javavcube;

public class Mobile {

	void main(String[] args) {
		System.out.println("main method started");
		showPlanDetails();
         recharge(299);

	}
	void showPlanDetails() {
   String  c_plan="Unlimited 299";
   String validity="28Days";
   String Data="1.5GB/Day";
   String Calls="Unlimited";
   System.out.println("Current Recharge Plan :"+c_plan);
   System.out.println("plan validty :"+ validity);
   System.out.println("Data :"+ Data);
   System.out.println("calls :"+Calls);
   
  }
	void recharge(double amount) {
		System.out.println("Recharge successful");
		System.out.println("Recharge Amount:"+ amount);
	}

}
