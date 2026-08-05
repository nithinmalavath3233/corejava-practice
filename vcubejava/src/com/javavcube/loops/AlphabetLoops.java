package com.javavcube.loops;

public class AlphabetLoops {
	
	static void alphabets() {
	     System.out.println("Capital Letters:");
		for(char j=90;j>=65;j-- ) {
			System.out.print(j+" ");
		}
		
		System.out.println();
		for(char j=65;j<=90;j++ ) {
			System.out.print(j+" ");
		}
		
		
		System.out.println();
		
		  System.out.println("Small  Letters:");
		System.out.println();
		for(char j=122;j>='a';j-- ) {
			System.out.print(j+" ");
		}
		System.out.println();
		for(char j='a';j<=122;j++ ){
			System.out.print(j+" ");
		}
		System.out.println();
		  System.out.println("Small  Letters:");
			System.out.println();
			for(char j='z';j>='a';j-- ) {
				System.out.print(j+" ");
			}
			System.out.println();
			for(char j='a';j<='z';j++ ){
				System.out.print(j+" ");
			}
		
	}
	

	public static void main(String[] args) {
		
		alphabets();
	}

}
