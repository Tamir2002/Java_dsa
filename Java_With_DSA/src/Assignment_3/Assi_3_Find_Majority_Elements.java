package Assignment_3;

import java.util.Scanner;

public class Assi_3_Find_Majority_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Brute-Force approach to find majority element in an array
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
        int arr[] = new int[n];
		//int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		// Call the function
		appearsNBy3(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

		
	public  static int appearsNBy3(int arr[])
	    {
	        int count1 = 0, count2 = 0;
	         
	        // take the integers as the maximum
	        // value of integer hoping the integer
	        // would not be present in the array
	        int first =  Integer.MIN_VALUE;
	        int second = Integer.MAX_VALUE;
	     
	        for (int i = 0; i < arr.length; i++) {
	     
	            // if this element is previously
	            // seen, increment count1.
	            if (first == arr[i])
	                count1++;
	     
	            // if this element is previously
	            // seen, increment count2.
	            else if (second == arr[i])
	                count2++;
	         
	            else if (count1 == 0) {
	                count1++;
	                first = arr[i];
	            }
	     
	            else if (count2 == 0) {
	                count2++;
	                second = arr[i];
	            }
	     
	            // if current element is different
	            // from both the previously seen
	            // variables, decrement both the
	            // counts.
	            else {
	                count1--;
	                count2--;
	            }
	        }
	     
	        count1 = 0;
	        count2 = 0;
	     
	        // Again traverse the array and
	        // find the actual counts.
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == first)
	                count1++;
	     
	            else if (arr[i] == second)
	                count2++;
	        }
	     
	        if (count1 > arr.length / 3)
	            return first;
	     
	        if (count2 > arr.length/ 3)
	            return second;
	     
	        return -1;
	    }
	     
	    // Driver code
//	    public static void main(String args[])
//	    {
//	        int arr[] = { 1, 2, 3, 1, 1 };
//	        int n = arr.length;
//	        System.out.println(appearsNBy3(arr, n));
//	         
//	    }
	}