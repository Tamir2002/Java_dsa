package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Rev_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a=2;
		int count=0;
	
		while(a<n) {
			//int i;
			if(n%a==0) {
				count++;
				break;
			}
			a++;
		}
			if(count==0) {
				System.out.println("Prime");
			}
			else {
				System.out.println("Not Prime");
			}
		

	}

}
