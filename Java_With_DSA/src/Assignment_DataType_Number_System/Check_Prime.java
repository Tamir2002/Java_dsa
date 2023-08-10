package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int i=2;
		while(i<n) {
			if(i%2!=0) {
				count++;
				break;
			}
			i++;
		}
		if(count==0) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}

	}

}
