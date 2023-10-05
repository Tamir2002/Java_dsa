package Lecture_3_Pattern;

import java.util.*;

public class Pattern_31 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int row=1;
	int star=n;
	while(row<=n) {
		int i=1;
		while(i<=n) {
			int j=5;
			while(j>=i) {
	     	if(j==i)
		      System.out.print("* ");
	     	else
	     		
			 System.out.print(j+" ");
			i++;
		    j--;
	
			}
//			while(j>=1) {
//				System.out.print(j+" ");
//				j--;
//				
//			}
			
		}	
		System.out.println();
		row++;
	}
}
}
