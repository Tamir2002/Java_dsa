package Lect_4_Assignment_2_Data_Number_System;

import java.util.Scanner;

public class Print_Armstrong_Num_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int N1=sc.nextInt();
		int N2=sc.nextInt();
	    for(int i=N1;i<N2;i++) {
	    	int temp,rem,sum=0;
	    	temp=i;
	    	while(temp!=0) {
	    		rem=temp%10;
	    		sum=sum+(rem*rem*rem);
	    		temp=temp/10;
	    		
	    	}
	    	if(sum==i) {
	    		System.out.println(i);
	    	}
	    }

	}

}
