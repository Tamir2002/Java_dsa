package Assignment_DataType_Number_System;
import java.util.*;
public class Sum_Of_Odd_Even_Placed_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int odd=0;
     int even=0;
     int pos=1;
     while(n>0) {
    	 int rem=n%10;
    	  n=n/10;
    	  if(pos%2==1) {
    		  odd=odd+rem;
    	  }
    	  else {
    		  even=even+rem;
    	  }
    	  pos++;
    	  
     }
     System.out.println(odd);
     System.out.println(even);
	}

}
