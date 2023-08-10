package Assignment_3;

import java.util.Scanner;

public class Assi_Zeros_And_Ones {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		 int arr[] = new int[N];
	        //int N = arr.length;
	        for(int i=0;i<arr.length;i++) {
	             arr[i]=sc.nextInt();
	        }
	  
	        segregate0and1(arr, N);
	        print(arr, N);
	}
		// TODO Auto-generated method stub
		static void segregate0and1(int arr[], int N)
	    {
	        int count = 0; // counts the no of zeros in arr
	      
	        for (int i = 0; i < N; i++) {
	            if (arr[i] == 0)
	                count++;
	        }
	  
	        // loop fills the arr with 0 until count
	        for (int i = 0; i < count; i++)
	            arr[i] = 0;
	  
	        // loop fills remaining arr space with 1
	        for (int i = count; i < N; i++)
	            arr[i] = 1;
	    }
	      
	    // function to print segregated array
	    static void print(int arr[], int N)
	    {
	        for (int i = 0; i < N; i++)
	            System.out.print(arr[i] + " ");    
	    }
	   
	    }