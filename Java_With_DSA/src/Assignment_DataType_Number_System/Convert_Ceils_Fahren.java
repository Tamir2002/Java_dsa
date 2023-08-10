package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Convert_Ceils_Fahren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	  int minf=sc.nextInt();
	  int maxf=sc.nextInt();
	  int step=sc.nextInt();
	  for(int i=minf;i<=maxf;i=i+step) {
	  int c=(int)((5.0/9)*(i-32));
	  System.out.println(i+" "+c);
	     }
	}

}
