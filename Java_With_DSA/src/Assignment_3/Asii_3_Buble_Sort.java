package Assignment_3;

import java.util.Scanner;

public class Asii_3_Buble_Sort {

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
		//pass
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {//6-1
				if(arr[i]>arr[i+1]) {
					//arr[i]=arr[i+1];
					int t=arr[i];
				    arr[i]=arr[i+1];
				    arr[i+1]=t;	
				}
			}
		}
	}
}
