package Lect_5_Basics_Data_Type_And_Loop;

import java.util.Scanner;

public class Dec_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
		int rem=n%2;
		sum=sum+rem*mul;
		mul=mul*10;
		n=n/2;
		}
		System.out.println(sum);

	}

}
