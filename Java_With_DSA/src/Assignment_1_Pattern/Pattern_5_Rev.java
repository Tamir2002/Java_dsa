package Assignment_1_Pattern;
import java.util.*;
public class Pattern_5_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			
			//next row preparation
			row++;
			star--;
			space++;
			System.out.println();
		
			
		}

	}

}
