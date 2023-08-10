package Lect_7_Function;

import java.util.Scanner;

public class Function_Range_Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
	    int i=n1;
	    int sum=0;
	    while(i<n2){
	    	// i=n1;
	    	int temp=i;
	    	while(temp!=0) {
	    		int rem=temp%10;
	    		sum=sum+(rem*rem*rem);
	    		temp=temp/10;
	    		
	    	}
	    	if(sum==i) {
	    		System.out.println(i);
	    	}
	    	i++;
	    }
	  
	   
		
	}
}


