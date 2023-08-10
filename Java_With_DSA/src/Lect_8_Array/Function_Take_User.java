package Lect_8_Array;

import java.util.Scanner;

public class Function_Take_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];// creation
        //input
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        Display(arr);
        
	}
	public static void Display(int [] arr) {
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
		System.out.println();
	}
	

}
