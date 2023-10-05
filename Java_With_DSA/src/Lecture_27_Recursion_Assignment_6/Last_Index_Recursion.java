package Lecture_27_Recursion_Assignment_6;

import java.util.Scanner;

public class Last_Index_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		 System.out.println(firstIndex(arr,n-1,item));
			}
			public static int firstIndex(int[]arr,int i,int item) {
				if(i<0) {
					return -1;
				}
				if(arr[i]==item) {
					return i;
				}
				return firstIndex(arr,i-1,item);
			}
}
