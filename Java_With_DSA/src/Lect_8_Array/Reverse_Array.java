package Lect_8_Array;

import java.util.Scanner;

public class Reverse_Array {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int N=sc.nextInt();
			int[] arr =new int[N];
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			ReverseArray(arr);
			for(int k=0;k<arr.length;k++) {
				System.out.println(arr[k]+" ");
			}
			//System.out.println(ReverseArray(arr));

		}

		public static void ReverseArray(int[] arr) {
			int i = 0;
			int j = arr.length - 1;
			while (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;

			}

	}

}
