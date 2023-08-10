package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Arm_Rev_Fun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print(IsArmstrongNumber(n));

	}
	public static boolean IsArmstrongNumber(int n) {
		int m=countofdigits(n);
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, m));
			n=n/10;
		}
		if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int countofdigits(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
