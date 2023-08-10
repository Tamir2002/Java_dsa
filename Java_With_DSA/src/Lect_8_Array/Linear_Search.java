package Lect_8_Array;

import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		   // System.out.println("Enter number of elements:");
		    int N = sc.nextInt();
		    
		    //System.out.println("Enter elements:");

		    // storing elements in an array
		    int[] arr = new int[N];
		    for (int i = 0; i < N; i++) {
		      arr[i] = sc.nextInt();
		    }

		    // asking user for target element
		   // System.out.println("Enter target element:");
		    int target = sc.nextInt();

		    // using linear search to find element
		    int index = Search(N, arr, target);
		    System.out.println(Search(N,arr,target));
	}

		  public static int Search(int N, int[] arr, int target) {
		    // using for loop to traverse the array
		    for (int i = 0; i < N; i++) {
		      // if target is found return
		      if (arr[i] == target) 
		    	  return i;
		    }
		    // if the target is not present return
		    return -1;
		  }
		

	}


