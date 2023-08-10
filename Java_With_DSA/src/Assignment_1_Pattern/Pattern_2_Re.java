package Assignment_1_Pattern;

import java.util.Scanner;

public class Pattern_2_Re {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int num=1;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print(num+"\t");
				i++;
				num++;
			}
			
			System.out.println();
			row++;
			star++;
	
		}

	}

}
