package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Shopping_Games_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while (test--  > 0) {

			int a = sc.nextInt();// Aayush
			int h = sc.nextInt();// Harshit
			int Aayush_total_phone = 0;
			int Harshit_toatal_phone = 0;
			int curr = 1;
			while (true) {
				Aayush_total_phone += curr;

				if (Aayush_total_phone > a) {
					System.out.println("Harshit");
					break;
				}

				curr++;
				Harshit_toatal_phone += curr;
				if (Harshit_toatal_phone > h) {
					System.out.println("Aayush");
					break;
				}
				curr++;

			}
			
		}

	}

}
