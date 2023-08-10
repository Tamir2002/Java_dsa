package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		 int row=1;
		 int space =n-1;
		 int star=1;
		 while(row<=n){
		      // space
		     int i=1;
		     while(i<=space){
		         System.out.print("  ");
		         i++;

		     }
		     int j=1;
		    int  val=1;
		     while(j<=star){
		         System.out.print( val + " ");
		         if(j<(star/2)+1) {
		        	 val++;
		         }
		         else {
		        	 val--;
		         }
		         j++;
		         
		     }
		     // next row
		     space--;
		     star+=2;
		     row++;
		     System.out.println();
		    }

	}

}
