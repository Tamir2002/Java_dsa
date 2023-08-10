package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int step;
		int max;
		int lcm=0;
		if(n1>n2) {
			max=step=n1;
		}
		else {
			max=step=n2;
		}
		while(n1!=0) {
			if(max%n1==0&&max%n2==0) {
				lcm=max;
				break;
			}
			max=max+step;
		}
		System.out.println(lcm);

	}

}
