package Lect_19_Recursion;

public class Recursion_Count_PrintSubSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		PrintPermutation(str,"");
		System.out.println(count);

	}
	static int count=0;
	public static void PrintPermutation(String ques,String ans) {
		//char ch=ques.charAt(i);
		if(ques.length()==0) {
			System.out.println(ans+" ");
			count++;
			return ;
		}
		

		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);

			String s1=ques.substring(0,i);
			String s2=ques.substring(i+1);
			PrintPermutation(s1+s2,ans+ch);
		}
	}


}
