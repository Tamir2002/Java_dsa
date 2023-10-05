package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi_Zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int a=1;
		int val=4;
		while(row<=n) {
//			int k=1;
//			while(k<=row) {
//				System.out.print(a+" ");
//				k++;
//			}
			
		
			
			int i=1;
			while(i<=star) {
//				if(i==2)
//					System.out.print(a+" ");
				if(i<=star) {
					
					System.out.print(a+" ");
				}
				else if(i==1||i==n)
				System.out.print(a+" ");
				else
					System.out.print("0 ");
				i++;
			}
		
//			if(row<n) {
//				star+=2;
//				a++;
//			}
//			else {
//				star-=2;
//				a--;
//			}
			
			
			System.out.println();
			row++;
			a++;
			star++;
		}

	}

}
