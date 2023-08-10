package Lecture_16_String;

import java.util.Scanner;

public class String_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s);
		String str2=new String("Hello");
		str=str+str2;

	}

}
