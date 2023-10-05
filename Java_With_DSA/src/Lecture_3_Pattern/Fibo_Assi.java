package Lecture_3_Pattern;
import java.util.*;
public class Fibo_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    
		    int row=1;
		    int star=1;
            int a=0;
            int b=1;
		    while(row<=n){
		   // star
		      // int a=0;
		      // int b=1;
		       int i=1;
		     while(i<=star){
		         System.out.print(a+" ");
		        
		         int c=a+b;
		         a=b;
		         b=c;
		          i++;
		     }

		     row++;
		     star++;
		     System.out.println();

		    }

		

	}

}
