package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Fibonacci_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int i=1;
		while(i<=n) {
			int c=a+b;
			a=b;
			b=c;
			i++;
			//System.out.print(c+" ");
		}
		System.out.print(a);
		
	}

}
