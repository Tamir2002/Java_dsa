package Lect_9_Array_Qps;

import java.util.Scanner;

public class Revise_Find_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int [n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int item=sc.nextInt();
		System.out.println(Search(arr,item));

	}
	public static int Search(int [] arr,int item) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return -1;
	}

}
