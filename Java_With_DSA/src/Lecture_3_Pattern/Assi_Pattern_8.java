package Lecture_3_Pattern;
import java.util.*;
public class Assi_Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n-1;
		int space=-1;
		
		while(row<=n*2-1)
		{
			//System.out.print(" ");
			
			int i=0;
			while(i<=star)
			{
				System.out.print("*");
				i++;
			}

			
			int s=0;
			while(s<space&&row!=1)
			{
				System.out.print(" ");
				s++;
			}
			
			int m=0;
			if(row==1||row==n*2-1)
			{
				m=1;
			}
			while(m<=star)
			{
				System.out.print("*");
				m++;
			}
			
			row++;
			System.out.println();
			
			if(row<=n)
			{
				star--;
				space+=2;
			}
			else
			{
				star++;
				space-=2;
			}
			
		}
		System.out.println();
		row++;
			

	}

}
