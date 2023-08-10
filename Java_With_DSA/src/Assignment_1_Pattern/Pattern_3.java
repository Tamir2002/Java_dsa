package Assignment_1_Pattern;
import java.util.*;
public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		 Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
	        int row=1;
	        int space=0;
	         int star=n;
	         while(row<=n){

	             // space
//	             int i=1;
//	             while(i<=space){
//	                 System.out.print("  ");
//	                 i++;
	             
	              // star
	             int j=1;
	             while(j<=star) {
	                 System.out.print("* ");
	                 j++;
	             }
	         
	             // next row print
	             row++;
	             System.out.println();
	             star--;
	             space++;
	         ;
	         }
	}
	}


