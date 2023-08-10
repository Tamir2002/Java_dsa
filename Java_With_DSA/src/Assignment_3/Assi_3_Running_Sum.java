package Assignment_3;

import java.util.Scanner;

public class Assi_3_Running_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	   int [] nums=new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=sc.nextInt();
		}
		//int sum=new int[n];
	  int[] b= RunningSum(nums);
	   for(int i=0;i<n;i++) {
		   System.out.print(b[i]+" ");
	   }
	}
		    public static int[] RunningSum(int[] nums) {
		    	int n1=nums.length;
		    for (int i = 1; i < n1; i++)
		        nums[i] =nums[i]+nums[i-1];
		    return nums;
		    }
		    
		}
