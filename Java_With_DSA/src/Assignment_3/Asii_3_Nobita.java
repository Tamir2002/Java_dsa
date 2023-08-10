package Assignment_3;

import java.util.Scanner;

public class Asii_3_Nobita {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			 int x=sc.nextInt();
	           int n=sc.nextInt();
	           int rem=x%n;
	           System.out.println(Math.min(rem,n-rem));
	       }
	    }
	}