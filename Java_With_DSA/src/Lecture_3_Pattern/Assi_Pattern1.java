package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi_Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-3;
     
		while(row<=n) {
			int i=1;
			int num=1;
			while(i<=star) {
				System.out.print(num+" ");
				i++;
				num++;
			}
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			int k=1;
			int val=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print(val+ " ");
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