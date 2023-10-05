package Lecture_3_Pattern;
import java.util.*;
public class Pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=n) {
				
		
				int j=5;
				while(j>=1) {
		     	System.out.print(j+" ");
				i++;
			    j--;
		
				}
			}	
			System.out.println();
			row++;
		}

	}

}
