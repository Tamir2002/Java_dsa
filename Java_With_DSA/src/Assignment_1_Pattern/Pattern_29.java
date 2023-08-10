package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		 int row=1;
		 int space =n-1;
		 int star=1;
		 int zero=-1;
		 while(row<=n){
		      // space
		     int i=1;
		     while(i<=space){
		         System.out.print("  ");
		         i++;

		     }
		     int j=1;
		     int val=row;
		     while(j<=star) {
		    	
		    	 if(row==1||row==n) {
		    		 System.out.print(val+" ");
		    	 }
		    	 j++;
		    	
		     }
		     val++;
		     int k=1;
		     while(k<=zero) {
		    	 System.out.print(k+" ");
		    	 k++;
		     }
		     
		     
		     System.out.println();
		     row++;
		     space--;
		     star++;

		     

	  }

	}
}  
