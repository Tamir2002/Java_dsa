package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Sample_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n;
		int sum=0;
		while(sc.hasNextInt()) {
			n=sc.nextInt();
			sum=sum+n;
			if(n>-1000&&n<1000) {
				if(sum>=0) {
					System.out.println(n);
				}
				else {
					break; 
				}
			}
		}
		

	}

}
