package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space1=n/2;
		int space2=-1;
		while(row<=n) {
			int i=1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=space2) {
				System.out.print("  ");
				k++;
			}
			int l=1;
			if(row==n||row==1) {
				l=2;
			}
			while(l<=star) {
				System.out.print("* ");
				l++;
			}
			if(row>n/2) {
				space1++;
				space2-=2;
			}
			else {
				space1--;
				space2+=2;
			}
			System.out.println();
			row++;
		}

	}

}
