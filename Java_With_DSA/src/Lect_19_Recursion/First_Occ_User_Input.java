package Lect_19_Recursion;

import java.util.Scanner;

public class First_Occ_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int  i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int item=sc.nextInt();
		System.out.println(FirstIndex(arr,0,item));
//		int item=sc.nextInt();

	}
	public static int FirstIndex(int [] arr,int i,int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
			
		}
	
		
		 return FirstIndex(arr,i+1,item);
	}

}
