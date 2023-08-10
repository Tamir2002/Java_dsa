package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assi_3_Square_Sorted_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];

      
        for (int i = 0; i < n; i++) {
            //System.out.print(arr[i] + " ");
        	arr[i]=sc.nextInt();
        }
       // Arrays.sort(arr);
        sortSquares(arr);
        Arrays.sort(arr);
        System.out.println("");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
	}


	    // Function to sort an square array
	    public static void sortSquares(int arr[])
	    {
	        int n = arr.length;
	 
	        // First convert each array elements
	        // into its square
	        for (int i = 0; i < n; i++)
	            arr[i] = arr[i] * arr[i];
	    }
	
	   
}		    
		



