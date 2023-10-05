package Lecture_3_Pattern;
import java.util.*;
public class Test_Num {

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
				System.out.print("  ");
				i++;
			}
			
			//int num=1;
			int j=1;
		  
			while(j<=star) {
				System.out.print(num+" ");
				j++;
				num++;
			}
	
	        
			System.out.println();
			row++;
			star++;
			space--;
		}
		

	}

}
