package Assignment_DataType_Number_System;

import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 for(int i=0;i<str.length();i++) {
	 char ch=str.charAt(i);
	 if(ch=='0') {
		 System.out.print('5');
	 }
	 else {
		 System.out.print(ch);
	 }
    }
}

}
