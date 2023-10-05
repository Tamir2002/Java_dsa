package Lecture_3_Pattern;

import java.util.Scanner;

public class Assignment_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=-1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
			}
			j++;
			int k=1;
			while(k<=space) {
				System.out.print("  ");
			
			k++;
		}
			System.out.println();
			row++;
			star--;
			space+=2;
		}
		

	}

}
