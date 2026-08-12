package com.javavcube.loops;
import java.util.Scanner;
public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		String digitsum=Integer.toString(n);
		int digitcount=digitsum.length();
		if(isArmstrong(n,digitcount)) {
			System.out.println(n +"   is a Armstrong number");
		}
		else {
			System.out.println(n +"   is not a Armstrong number");
		}

	}

	

	private static boolean isArmstrong(int n,int digitcount) {
		boolean status=false;
      int temp=n;
      int r=0;
      int sum=0;
      while(n>0) {
    	  r=n%10;
    	  n=n/10;
        sum=(int)(sum+Math.pow(r,digitcount));
      }
    		if(sum==temp) {
    			status=true;
    		}
		return status;
	}

}
