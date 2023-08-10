package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Count_Digits_Duplicate_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int digits=sc.nextInt();
		int count=0;
	   while(n!=0) {
		   int rem=n%10;
		   if(digits==rem) {
			   count++;
		   }
		   n=n/10;
	   }
		
	   System.out.println(count);

	}

}
