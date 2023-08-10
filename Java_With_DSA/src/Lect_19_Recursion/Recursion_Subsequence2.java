package Lect_19_Recursion;

public class Recursion_Subsequence2 {
 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		//PrintSubSeq(str,"");
		//System.out.println(count);
		System.out.println("\n"+PrintSubSeq1(str," "));

	}
	public static void PrintSubSeq(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			count++;
			return;
		}
		char ch=ques.charAt(0);//
		PrintSubSeq(ques.substring(1),ans);
		PrintSubSeq(ques.substring(1),ans+ch);
	}
	
	public static int PrintSubSeq1(String ques,String ans) {
		if(ques.length()==0) {
			System.out.print(ans+ " ");
			return 1;
		}
		char ch=ques.charAt(0);//
		int f1=PrintSubSeq1(ques.substring(1),ans);
		int f2=PrintSubSeq1(ques.substring(1),ans+ch);
		return f1+f2;
	}

}
