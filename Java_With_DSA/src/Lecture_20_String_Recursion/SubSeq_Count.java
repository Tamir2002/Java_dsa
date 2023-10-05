package Lecture_20_String_Recursion;
import java.util.*;
public class SubSeq_Count {
	static int count=0;
// 1st way easiest way
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
		String str=sc.next();
		///printSubSeq(str,"");
		//System.out.println(count);
		System.out.println(printSubSeq1(str,"\n"));
		
	}
	public static void printSubSeq(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans+" ");
			count++;
			return;
		}
		char ch=ques.charAt(0);//a
		printSubSeq(ques.substring(1),ans);
		printSubSeq(ques.substring(1),ans+ch);
		
	}
	
	// 2nd way
	public static int printSubSeq1(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return 1;
		}
		char ch=ques.charAt(0);//a
		int f1=printSubSeq1(ques.substring(1),ans);
		int f2=printSubSeq1(ques.substring(1),ans+ch);
		return f1+f2;
		
	}

}
