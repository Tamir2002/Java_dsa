package Assignment_1_Pattern;
import java.util.*;
public class Pattern_28_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		 int row=1;
		 int space =n-1;
		 int star=1;
		 while(row<=2*n-1){
		      // space
		     int i=1;
		     while(i<=space){
		         System.out.print("  ");
		         i++;

		     }
		     int j=1;
		    int  val=row;
		     while(j<=star){
		         System.out.print( val +" ");
		         if(j<(star/2)+1) {
		        	 val++;
		         }
		         else {
		        	 val--;
		         }
		         j++;
		         
		     }
//		     if(row<=n/2) {
//					star+=2;
//					space--;
//				}
//				else {
//					star-=2;
//					space++;
//				}
		     
		     // next row
		     space--;
		     star+=2;
		     row++;
		     System.out.println();
		    }

	}

}
