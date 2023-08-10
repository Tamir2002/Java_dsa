package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_11_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int  n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j%2==1) {
					System.out.print("* ");
				}
			
				else {
					System.out.print("  ");
				}
				j++;
			}
				System.out.println();
				row++;
				star+=2;
				space--;
				
			}
		}

	}


