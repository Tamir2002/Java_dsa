package Lect_4_Assignment_2_Data_Number_System;
public class GCD_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divisor=36;
		int divident=60;
		while(divident%divisor!=0) {
				int rem=divident%divisor;
				divident=divisor;
				divisor=rem;
		}
		System.out.println(divisor);

	}

}
