package Lect_19_Recursion;

public class Recursion_Permutation_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		PrintPermutation(str,"");

	}
	public static void PrintPermutation(String ques,String ans) {
		if(ques.length()==0) {
			System.out.println(ans+" ");
		}
		for(int i=0;i<ques.length();i++) {
			String s1=ques.substring(0,i);
			String s2=ques.substring(i+1);
			PrintPermutation(s1+s2,ans+ques.charAt(i));
		}
	}

}
