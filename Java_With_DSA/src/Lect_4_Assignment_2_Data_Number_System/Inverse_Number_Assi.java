package Lect_4_Assignment_2_Data_Number_System;

public class Inverse_Number_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=32145;
		int pos=1;
		int ans=0;
		while(n>0) {
			int rem=n%10;
			ans=(int)(ans + pos*(Math.pow(10, rem-1)));
			n=n/10;
			pos++;
		}
		System.out.println(ans);

	}

}
