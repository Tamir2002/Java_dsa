package Lect_12_Mix_Leetcode_Qps;

import java.util.Scanner;

public class User_Product_of_Array_Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	          int ans[]=product(arr);
	         
				for(int i=0;i<ans.length;i++) {
					System.out.print(ans[i]+" ");
	                
				}

	    }
	    public static int[] product(int arr[]) {
			int left[] = new int[arr.length];
			left[0] = 1;
			for (int i = 1; i < left.length; i++) {
				left[i] = left[i - 1] * arr[i - 1];
			}
			int right[] = new int[arr.length];
			right[arr.length - 1] = 1;
			for (int i = right.length - 2; i >= 0; i--) {
				right[i] = right[i + 1] * arr[i + 1];
			}
			for (int i = 0; i < right.length; i++) {
				arr[i] = left[i] * right[i];
			}
			return arr;
	    }
	}