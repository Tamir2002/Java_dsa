package Assigment_5_String;

import java.util.Scanner;

public class Difffrence_Ascii_Codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		Ascii_Codes(str);
	}
   
	public static void Ascii_Codes(String str) {
		
		String ans="";
		char prev=str.charAt(0);
		for (int i =1; i < str.length(); i++) {
		    char curr=str.charAt(i);
			ans=ans+prev+(curr-prev);//c-a=99-97=2
			prev=curr;
			
		}
		ans=ans+prev;
		System.out.println(ans);
	}
}
