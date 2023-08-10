package Lect_7_Function;

import java.util.Scanner;

public class Function_Arm_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
//		int d=Countofdigit(n);
//		System.out.println(d);
		System.out.println(Armstrong_Number(n));
		

	}
	public static boolean Armstrong_Number(int n) {
		int d=Countofdigit(n);
		int sum=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+Math.pow(rem, d));
			n=n/10;
		}
         if(sum==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int Countofdigit(int n) {
		int count=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

}
