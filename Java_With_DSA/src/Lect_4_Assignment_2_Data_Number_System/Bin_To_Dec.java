package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Bin_To_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int mul=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+mul*rem;
			mul=mul*2;
			n=n/10;
		}
		System.out.println(sum);

	}

}
