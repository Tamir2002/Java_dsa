package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Print_Series_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
		int d=0;
		int x;
		for(int i=1;i<=N1;i++) {
			for(int j=(d+i);j<=1001;j++)
			{
				x=(3*j)+2;
				if(x%N2!=0) {
					System.out.println(x);
					break;
				}
				else
					d++;
			}
		}
		

	}

}
