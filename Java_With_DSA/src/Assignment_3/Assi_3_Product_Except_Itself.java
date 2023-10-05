package Assignment_3;

import java.util.Scanner;

public class Assi_3_Product_Except_Itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scn = new Scanner(System.in);
	        int n = scn.nextInt();
	        long[] arr = new long[n];

	        for(int i=0;i<arr.length;i++){
	            arr[i]=scn.nextInt();
	        }
	        long[] left = new long[n];
	        left[0] =1;
	        for(int i=1;i<left.length;i++){
	            left[i] = left[i-1]*arr[i-1];
	        }
	        long[] right = new long[n];
	        right[n-1]=1;
	        for(int i=n-2;i>=0;i--){
	            right[i]=right[i+1]*arr[i+1];
	        }
	        for(int i=0;i<n;i++){
	            System.out.print(left[i]*right[i]+ " ");
	        }
	    }

	}