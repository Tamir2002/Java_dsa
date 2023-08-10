package Assignment_1_Pattern;

import java.util.*;

public class Pattern_18_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("   ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("*  ");
				j++;
			}
			if(row<=n/2) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
//			space--;
//		     star+=2;
			System.out.println();
			row++;
		}

	}

}
