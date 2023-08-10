package Lect_19_Recursion;

public class Recursion_Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="abc";
printSubSq(str,"");
	}
	static int count=0;
	public static void printSubSq(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			count++;
			return;
		}
		char  ch=ques.charAt(0);
		printSubSq(ques.substring(1),ans);
		printSubSq(ques.substring(1),ans + ch);
	}

}
