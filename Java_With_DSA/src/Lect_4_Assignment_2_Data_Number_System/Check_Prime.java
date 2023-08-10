package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Check_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int i=2;
		int count=0;
		while(i<n) {
			if(n%i==0) {
				count++;
				break;
			}
			i++;
		}
		
		if(count==0) {
			System.out.println("prime number");
		}
		else {
			System.out.println("not prime");
		}

	}
	

}
