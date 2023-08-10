package Assignment_1_Pattern;

import java.util.*;

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
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
		     while(j<=star){
		         System.out.print("1 ");
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
