package Lecture_15_2D_Array;

import java.util.Scanner;

public class _Input_And_Display_Array_2_D_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();// row
		int m=sc.nextInt();// col
		int [][]arr=new int[n][m];
		//user input
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
				
			 }
		 }
		 //print
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr[0].length;j++) {
				 System.out.print(arr[i][j]+" ");
			 }
			 System.out.println();
		 }
	}

}
