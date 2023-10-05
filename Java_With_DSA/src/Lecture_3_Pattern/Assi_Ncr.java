package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi_Ncr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=0;
		int star=0;
//		int ncr=1;
		while(row<n) {
			int i=0;
			int ncr=1;
			while(i<=star) {
				System.out.print(ncr+ "\t");
				ncr=((row-i)*ncr)/(i+1);
				i++;
			}
			row++;
			star++;
			System.out.println();
			
		}

	}

}
