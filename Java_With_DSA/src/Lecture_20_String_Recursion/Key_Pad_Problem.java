package Lecture_20_String_Recursion;
import java.util.*;
public class Key_Pad_Problem {
	static int count=0;
 static String[] key= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   String str=sc.next();
   printKeyPaid(str,"");
   System.out.println("\n"+count);
		
		
	}
	public static void printKeyPaid(String ques,String ans) {// 12
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		
		char ch=ques.charAt(0);//'1'-->49 ascii
		String pressString=key[ch-48];
		for(int i=0;i<pressString.length();i++) {
			printKeyPaid(ques.substring(1),ans+pressString.charAt(i));
		}
	}

}
