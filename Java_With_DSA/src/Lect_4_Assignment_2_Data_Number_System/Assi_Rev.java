package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Assi_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int rem;
		while(n!=0) {
			rem=n%10;
			sum=10*sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		

	}

}
