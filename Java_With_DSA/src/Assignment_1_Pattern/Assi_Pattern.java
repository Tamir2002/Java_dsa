package Assignment_1_Pattern;

import java.util.Scanner;

public class Assi_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		 int row=1;
		 int space =n-1;
		 int star=1;
		 int num=1;
		 while(row<=2*n-1){
		      // space
		     int i=1;
		     while(i<=space){
		         System.out.print("\t");
		         i++;
		     }
		     int j=1;
		    int  val=num;
		     while(j<=star){
		         System.out.print( val+ "\t");
		         if(j<(star/2)+1) {
		        	 val++;
		         }
		         else {
		        	 val--;
		         }
		         j++;
		         
		     }
		     if(row<n) {
					star+=2;
					space--;
					num++;
					
				}
				else {
					star-=2;
					space++;
					num--;
					
				
				}
		     
		     // next row
//		     space--;
//		     star+=2;
		     row++;
		    // val--;
		     System.out.println();
		    }


	}

}
