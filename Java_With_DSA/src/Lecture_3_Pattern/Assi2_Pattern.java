package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi2_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("*");
				i++;
			}
			System.out.println();
			row++;
			star++;
		}

	}

}
