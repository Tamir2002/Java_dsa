package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Arm_Ass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();

			int temp=n;
			int count_digit=0;
		   while(temp!=0)
		   {
			   count_digit++;
			   temp/=10;
		   }
		   temp=n;
		   int sum=0;
		   while(temp!=0)
		   {
			   int rem=temp%10;
			   sum+=Math.pow(rem, count_digit);
			   temp/=10;
		   }
		   if(n==sum)
		   {
			   System.out.println(true);
		   }
		   else
			   System.out.println(false);
			   
		}

	}
