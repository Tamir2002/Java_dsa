package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Lcm_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N1;
		int N2;
		int lcm=0;
		int step;
		int max;
		Scanner sc =new Scanner(System.in);
		N1=sc.nextInt();
		N2=sc.nextInt();
		if(N1>N2) {
			max=step=N1;
		}
		else {
			max=step=N2;
		}
		while(N1!=0) {
			if(max%N1==0&& max%N2==0) {
				lcm=max;
				break;
			}
			max=max+step;
		}
		System.out.println(lcm);

	}

}
