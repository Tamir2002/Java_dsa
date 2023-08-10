package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Chewbaccaa_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		long n=sc.nextLong();
		long sum=0;
		long mul=1;
		while(n>0) {
			long rem=n%10;
			if(rem>=9 && n!=13) {
				sum=sum+(13-rem)*mul;
				
			}
			else {
				sum=sum+rem*mul;
			}
			n=n/10;
			mul=mul*10;
		}
		System.out.println(sum);

	}

}
