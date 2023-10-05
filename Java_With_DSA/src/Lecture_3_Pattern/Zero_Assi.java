package Lecture_3_Pattern;
import java.util.*;
public class Zero_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
		    int n = sc.nextInt();

		    int row=1;
		   // int star=1;
		    int space=-1;

		    while(row<=n){
		    // star
		    if(row==1){
		     System.out.print(row);
		    } else{
		     System.out.print(row);
		    int i=1;
		    while(i<=space){
		        System.out.print("  "+"0"+" ");
		        i++; 
		    }
		    System.out.print("  "+row);
		    }
		    
		     row++;
		     space++;
		     System.out.println();



		    }

	}

}
