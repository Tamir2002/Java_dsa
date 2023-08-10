package Assignment_1_Pattern;
import java.util.*;
public class Pattern_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int row = 1;
	        int star = n;
	        while (row <= n) {
	            int i = 1;
	            while (i <= star) {
	                System.out.print("* ");
	                i++;
	            }
	            // next row pre
	            row++;
	            System.out.println();
	            star--;

	        }

	}

}
