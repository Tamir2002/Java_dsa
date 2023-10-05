package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi_Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int a=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				if(row==1||row==2) {
				System.out.print(a+" ");
				}
				else if(i<=row) {
					System.out.print(a+" ");
				}
				else
				i++;
			}
			
			System.out.println();
			row++;
			a++;
			val++;
		}

	}

}
