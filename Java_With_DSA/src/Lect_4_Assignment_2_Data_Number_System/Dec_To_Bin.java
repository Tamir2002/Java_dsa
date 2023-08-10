package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Dec_To_Bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n!=0) {
			int rem=n%2;
			sum=sum+mul*rem;
			mul=mul*10;
			n=n/2;
		}
		System.out.println(sum);

	}

}
