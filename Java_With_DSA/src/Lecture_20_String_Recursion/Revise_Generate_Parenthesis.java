package Lecture_20_String_Recursion;

public class Revise_Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		Parenthesis(n,0,0,"");
	}
	public static void Parenthesis(int n,int opening,int closing,String ans) {
		
		if(opening==n && closing==n) {
			System.out.println(ans);
			return;
			
		}
		if(opening<n) {
			Parenthesis(n,opening+1,closing,ans+"(");
		}
		if(opening>closing) {
			Parenthesis(n,opening,closing+1,ans+")");
		}
		

	}

}
