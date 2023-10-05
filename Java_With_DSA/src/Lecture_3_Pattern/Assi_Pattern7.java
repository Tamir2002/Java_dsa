package Lecture_3_Pattern;

import java.util.Scanner;

public class Assi_Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int a=1;
		//int val=3;
		while(row<=n) {
			int i=1;
			while(i<=row) {
				if(row==1||row==2) {
					//System.out.print("*  ");
				System.out.print(a+" ");
				}
				else if(i%2==0) {
					System.out.print(0+" ");
					
				}
				else {
					System.out.print(a+" ");
				}
				i++;
			}
//			int j=1;
//	
//			while(j<=row) {
//				if(j%2==0) {
//					System.out.print(0+" ");
//				}
//				else {
//					System.out.print(val+" ");
//				}
//				j++;
//			}
		
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
			//val++;
			//star+=2;
		}

	}

}
