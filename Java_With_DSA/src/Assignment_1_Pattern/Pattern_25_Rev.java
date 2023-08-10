package Assignment_1_Pattern;
import java.util.*;
public class Pattern_25_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
	 	int star=1;
	     int num=1;
		int space=n-1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("\t");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(num + "\t");
				j++;
				num++;
			}
			
			System.out.println();
			row++;
			space--;
			star+=2;
			
		}
		

	}

}
