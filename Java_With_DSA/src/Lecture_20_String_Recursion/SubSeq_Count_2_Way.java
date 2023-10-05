package Lecture_20_String_Recursion;

public class SubSeq_Count_2_Way {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abc";
		printSubSeq();
		//System.out.println(count);
		
	}
	public static int printSubSeq(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			
			return 1;
		}
		char ch=ques.charAt(0);//a
		int f1=printSubSeq(ques.substring(1),ans);
		int f2=printSubSeq(ques.substring(1),ans+ch);
		
	}

}