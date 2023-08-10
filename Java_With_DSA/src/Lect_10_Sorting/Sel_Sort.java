package Lect_10_Sorting;

import java.util.Scanner;

public class Sel_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		int [] arr= new int[N];
//		System.out.println(Sort(arr));
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			///System.out.print(arr[i]+" ");
		}
		Sort(arr);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
		

	}
	public static void Sort(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			int min_idx=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx=j;
				}
			}
			int t=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=t;
		}
	}

}
