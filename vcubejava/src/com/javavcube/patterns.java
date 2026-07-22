package com.javavcube;

public class patterns {

	public static void main(String[] args) {
		//int n=5;
	
        for(int i=1;i<=5;i++) {
        	for(int j=1;j<=5;j++) {
        	System.out.print("*");
        	
        	}
        	System.out.println();
        	
        }
     System.out.println("---------------------------------------------------------------------------------------");
     
     for(int i=1;i<=3;i++){
    	 for(int j=1;j<=5;j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     
     System.out.println("---------------------------------------------------------------------------------------");
     
     for(int i=1;i<=5;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     System.out.println("---------------------------------------------------------------------------------------");
 	int n=5;
     for(int r=1;r<=5;r++) {
    	for(int c=1;c<=n-r;c++) {
    		System.out.print(" ");    		
    	}
    	for(int co=1;co<=n;co++) {
    		System.out.print("*");
    	}
    	System.out.println();
    
    	
     }
     System.out.println("---------------------------------------------------------------------------------------");
  	
     for(int i=1;i<=5;i++) {
     	for(int j=1;j<=i;j++) {
     		System.out.print(j);
     	}
     	System.out.println();
     }
     System.out.println("---------------------------------------------------------------------------------------");
   	

     for(int i=1;i<=5;i++) {
     	for(int j=1;j<=i;j++) {
     		System.out.print(i);
     	}
     	System.out.println();
     }
     System.out.println("---------------------------------------------------------------------------------------");
    	
     for(int r=0;r<=5;r++) {
     	for(int c=0;c<=n-r;c++) {
     		System.out.print("*");    		
     	}
     	System.out.println();
     	
     }
     System.out.println("---------------------------------------------------------------------------------------");
     for(int r=1;r<=5;r++) {
     	for(int c=1;c<=n-r;c++) {
     		System.out.print(" ");    		
     	}
     	for(int col=1;col<=2*r-1;col++) {
     		System.out.print("*");
     	}
     	System.out.println();
     
     
      }
     System.out.println("---------------------------------------------------------------------------------------");	
     for(int r=1;r<=5;r++) {
      	for(int c=1;c<=r-1;c++) {
      		System.out.print(" ");    		
      	}
      	for(int col=1;col<=2*n-2*r+1;col++) {
      		System.out.print("*");
      	}
      	System.out.println();
      
      
       }
     System.out.println("---------------------------------------------------------------------------------------");	
     for (int i = 1; i <= 4; i++) {
    	    for (int j = 1; j <= 6; j++) {
    	        if (i == 1 || i == 4) {
    	            System.out.print("*");
    	        } else {
    	            if (j == 1 || j == 6) {
    	                System.out.print("*");
    	            } else {
    	                System.out.print(" ");
    	            }
    	        }
    	    }
    	    System.out.println();
    	}
	}

}
