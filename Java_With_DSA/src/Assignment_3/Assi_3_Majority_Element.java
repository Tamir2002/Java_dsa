package Assignment_3;

import java.util.Scanner;

public class Assi_3_Majority_Element {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[] = new int[n];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
 
        // Function calling
        findMajority(arr, n);
    }	// TODO Auto-generated method stub
		 public static void findMajority(int arr[], int n)
		    {
		        int maxCount = 0;
		        int index = -1; // sentinels
		        for (int i = 0; i < n; i++) {
		            int count = 0;
		            for (int j = 0; j < n; j++) {
		                if (arr[i] == arr[j])
		                    count++;
		            }
		 
		            // update maxCount if count of
		            // current element is greater
		            if (count > maxCount) {
		                maxCount = count;
		                index = i;
		            }
		        }
		 
		        // if maxCount is greater than n/2
		        // return the corresponding element
		        if (maxCount > n / 2)
		            System.out.println(arr[index]);
		 
		        else {
		        	
		        }
		          
		    }
		 
		   
		}