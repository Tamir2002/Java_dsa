package Assignment_3;

import java.util.Scanner;

public class Asii_3_Sorting_Linear_Time {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		 int arr[] = new int[N];
	        int n = arr.length;
	        for(int i=0;i<arr.length;i++) {
	        	arr[i]=sc.nextInt();
	        }
	        
	        // Calling the function
	        sort_arr(arr, n);
	        
	        // Printing the array
	        for (int i = 0; i < n; i++) {
	            System.out.println(arr[i] + " ");
	    }
	}
	
		// TODO Auto-generated method stub

		    // Function to sort the array of 0s 1s and 2s
		   public static void sort_arr(int A[], int n)
		    {
		        // Declaring 3 variables to store count
		        int i = 0, count0 = 0, count1 = 0, count2 = 0;

		        // Traverse the array completely
		        while ( i < n )  
		        {  
		            // If the element is 0
		            if ( A[i] == 0 )  
		            {  
		                count0 = count0 + 1;  
		            }  
		            // If the element is 1
		            if ( A[i] == 1 )  
		            {  
		                count1 = count1 + 1;  
		            }  
		            // If the element is 2
		            if ( A[i] == 2 )  
		            {  
		                count2 = count2 + 1;  
		            }  

		            i = i + 1;  
		        }  

		        // Updating the array
		        i = 0;

		        // Store all the 0s 
		        while (count0 > 0) {
		            A[i++] = 0;
		            count0--;
		        }
		        // Store all the 1s
		        while (count1 > 0) {
		            A[i++] = 1;
		            count1--;
		        }
		        // Store all the 2s
		        while (count2 > 0) {
		            A[i++] = 2;
		            count2--;
		        }
		    }

		  
		}
