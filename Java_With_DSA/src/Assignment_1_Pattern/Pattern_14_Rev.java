package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_14_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int star=1;
		int row=1;
		int space=n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			System.out.println();
			row++;
			//star++;
		
		}

	}

}
