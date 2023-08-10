package Lecture_15_2D_Array;

import java.util.Scanner;

public class Arrays_Wave_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int [][] arr=new int[n][m];
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
			for(int row=0;row<arr.length;row++) {
				arr[row][col]=sc.nextInt();
			}
		}
	}
		Wave(arr);
			
		
	}
		public static void Wave(int[][]arr) {
		for(int col=0;col<arr[0].length;col++) {
			if(col%2==0) {
			for(int row=0;row<arr.length;row++) {
				//arr[row][col]=sc.nextInt();
				System.out.println(arr[row][col]+" ");
			}
		
		}
			else {
				for(int row=arr.length-1;row>=0;row--) {
					System.out.println(arr[row][col]+" ");
				}
			}
	    }

	}

}
