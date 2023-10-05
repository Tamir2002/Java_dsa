package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class First_Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int  [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int m=sc.nextInt();
		 System.out.println(firstIndex(arr,0,m));
			}
			public static int firstIndex(int[]arr,int i,int m) {
				if(i<0) {
					return -1;
				}
				if(arr[i]==m) {
					return i;
				}
				return firstIndex(arr,i+1,m);
			}
}
