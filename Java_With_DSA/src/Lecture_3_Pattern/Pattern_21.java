package Lecture_3_Pattern;

import java.util.*;

public class Pattern_21 {
	public static void main(String[] args) {
		
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-3;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			// next row pre
			System.out.println();
			row++;
			space-=2;
			star++;
		}
	}

}
