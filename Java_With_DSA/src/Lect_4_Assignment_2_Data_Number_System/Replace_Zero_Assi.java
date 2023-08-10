package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Replace_Zero_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner sc = new Scanner(System.in);
		long n=sc.nextLong();
		long r;
		long rep=5;
		long d=1;
		for(long i=n;i>0;i=i/10) {
			r=i%10;
			if(r==0) {
				r=rep*d;
			}
			else {
				r=r*d;
			}
			System.out.print(r+"");
		}
	}
}
