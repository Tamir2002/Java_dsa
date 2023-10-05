package Lecture_3_Pattern;

import java.util.Scanner;

public class Numer_Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
			int n=sc.nextInt();
			int row=1;
			 int num=1;
			int star=-1;
			while(row<=n) {
				int j=1;
			
				while(j<=num) {
					if(j==2||j==4||j==6) 
						System.out.print("* ");
					else
					 System.out.print(num+" ");	 
					
                   j++;
				}
				num++;
				star+=2;
				System.out.println();
				row++;
				
			}
			
		}

	}


