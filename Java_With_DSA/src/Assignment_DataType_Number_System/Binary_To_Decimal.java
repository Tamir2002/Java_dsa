package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Binary_To_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		int sum=0;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem*mul;
			mul=mul*2;
			n=n/10;
		}
		System.out.println(sum);
	}

}
