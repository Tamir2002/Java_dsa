package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Reverse_Num_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rev=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		

	}

}
