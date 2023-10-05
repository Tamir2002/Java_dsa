package Lecture_3_Pattern;

import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		int a=1;
		int zero=0;
		while(row<=n) {
//			int i=1;
//			while(i<=space) {
//			    System.out.print("  ");
//			    i++;	
//			}
			int i=1;
			while(i<=row) {
				if(i==1||i==2) 
			System.out.print(a+" ");
			}
				
				i++;
			}
		int j=1;
		while(j<=star) {
			System.out.print("* ");
			
//			int k=1;
//			while(k<=row) {
//				if(k<(a/2)+1) {
//					a++;
//				}
//			}
			System.out.println();
			row++;
			star++;
			space--;
			a++;
		}

	}

}
