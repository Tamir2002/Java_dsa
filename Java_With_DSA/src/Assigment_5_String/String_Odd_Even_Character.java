package Assigment_5_String;

import java.util.Scanner;

public class String_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Odd_Even_Character(str);
	}
	public static void Odd_Even_Character(String str) {
		String ans="";
		for (int i =0; i<str.length(); i++) {
			char ch=str.charAt(i);
			if(i%2==0) {
				ans=ans+(char)(ch+1);
			}
			else {
				ans=ans+(char)(ch-1);
			}
			
		}
		System.out.println(ans);
	}

}
