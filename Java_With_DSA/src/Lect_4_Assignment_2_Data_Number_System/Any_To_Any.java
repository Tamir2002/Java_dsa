package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Any_To_Any {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n=sc.nextInt();
		int mul=1;
		int mul1=1;
		int sum=0;
		int ans=0;
		
		while(n>0) {
			int r=n%10;
			sum=sum+r*mul;
			mul=mul*n1;
			n=n/10;
		}
		while(sum>0) {
			int r=sum%n2;
			ans=ans+r*mul1;
			mul1=mul1*10;
			sum=sum/n2;
		}
		System.out.println(ans);

	}

}
