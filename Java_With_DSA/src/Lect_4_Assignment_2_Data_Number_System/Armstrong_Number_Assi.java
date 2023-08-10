package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Armstrong_Number_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		long temp=n;
		while(n>0) {
			long rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
			
		}
		//long temp=1;
		if(sum==temp) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		

	}

}
