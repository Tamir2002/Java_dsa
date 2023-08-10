package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_24_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int a=1;
		int num1=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			     int j=1;
					while(j<=num1) {
						System.out.print(a+" ");
						j++;
					}
			   System.out.println();
			row++;
			space--;
			num1+=2;
			a++;
		}

	}

}
