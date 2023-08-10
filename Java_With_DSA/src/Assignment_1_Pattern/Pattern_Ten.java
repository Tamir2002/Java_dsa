package Assignment_1_Pattern;
import java.util.*;
public class Pattern_Ten {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int n=sc.nextInt();
	        int star = n;
	        int space=0;
	        int row=1;
	        while (star > 0) {

	            // Inner loop
	            int j=0;
	            while (j <= n-star) {
	                // space
	                System.out.print("  ");
	                j++;
	            }

	            j = 0;

	            // Inner loop
	            while (j< (star * 2) - 1) {
	                // Print star
	                System.out.print("* ");
	                j++;
	            }
	            System.out.println();
	            star--;
	            row++;
	            space++;
	        }
	}

}
