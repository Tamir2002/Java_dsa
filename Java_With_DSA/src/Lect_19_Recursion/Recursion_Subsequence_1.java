package Lect_19_Recursion;

public class Recursion_Subsequence_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		PrintSubseq(str,"");

	}
	public  static void PrintSubseq(String ques,String ans) {
		
		char ch=ques.charAt(0);//a
		PrintSubseq(ques,.substring(1),ans);
		PrintSubseq(ques,.substring(1),ans+ch);
		
	}

}
