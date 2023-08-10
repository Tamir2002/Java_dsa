package Assignment_1_Pattern;
 import java.util.*;
public class Pattern_10_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       int row=1;
       int star=1;
       int space=n-1;
       while(row<=n) {
    	   int i=1;
    	   while(i<=space) {
    		   System.out.print("  ");
    		   i++;
    	   }
    	   int j=1;
    	   while(j<=star) {
    		   if(j==1||j==3||j==5||j==7||j==9) {
    			   System.out.print("* ");
    		   }
    		   else {
    			   System.out.print("! ");
    		   }
    		   j++;
    	   }
    	   System.out.println();
    	   row++;
    	   star+=2;
    	   space--;
       }
	}

}
