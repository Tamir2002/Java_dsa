package Lecture_15_2D_Array;

import java.util.Scanner;

public class Book_Allocation_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc=new Scanner(System.in);
	   int t=sc.nextInt();
	   while(t-->0) {
		int n=sc.nextInt();//no of book
		// int m=sc.nextInt();
		 int nos=sc.nextInt();// no of student
		int[] pages= new int[n];
		//int nos=sc.nextInt();//  no of student 
		for(int i=0;i<pages.length;i++) {
			pages[i]=sc.nextInt();
		}
		//int nos=sc.nextInt();
		System.out.println(minimumpages(pages,n,nos));
	   }

	}
	public static int minimumpages(int []pages,int n,int nos) {
		int lo=0;
		int hi=0;
		for(int i=0;i<pages.length;i++) {
			hi=hi+pages[i];
			
		}
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(isitpossible(pages,mid,n,nos)==true) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int [] pages,int mid,int n,int nos) {
		int student=1;
		int read_page=0;
		int i=0;
		while(i<pages.length) {
			if(read_page+pages[i]<=mid) {
				read_page+=pages[i];
				i++;
			}
			else {
				student++;
				read_page=0;
		
			}
			if(student>nos) {
				return false;
			}
		}
		return true;
	}

}
