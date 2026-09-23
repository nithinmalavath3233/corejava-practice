package com.javavcube.oops;

public class ExceptionHandlig03 {

	public static void main(String[] args) {
		System.out.println("main method started");
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}
//	catch(Exception e) { 
//		System.out.println("in catch");
//		e.printStackTrace();
//	}
		catch(NullPointerException e) { 
		System.out.println("in catch ofne");
		e.printStackTrace();
		}
		catch(ArithmeticException e) { 
		System.out.println("in catch of Ae");
		e.printStackTrace();
		}

//		catch(RuntimeException e) { 
//		System.out.println("in catch");
//		e.printStackTrace();
//		}
		
		System.out.println("main method ended");

	}

}



























//catch(RuntimeException e) { 
//System.out.println("in catch");
//e.printStackTrace();
//}
//catch(Exception e) { 
//System.out.println("in catch");
//e.printStackTrace();
//}
//catch(NullPointerException e) { 
//System.out.println("in catch ofne");
//e.printStackTrace();
//}
//catch(ArithmeticException e) { 
//System.out.println("in catch of Ae");
//e.printStackTrace();
//}