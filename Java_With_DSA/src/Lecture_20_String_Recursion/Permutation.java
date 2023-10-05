package Lecture_20_String_Recursion;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 String str="abc";
		 PrintPermutation(str,"");
	}
	public static void PrintPermutation(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		
		for (int i = 0; i <ques.length(); i++) {
			
			String ros=ques.substring(0,i)+ques.substring(i+1);
			char ch=ques.charAt(i);
			PrintPermutation(ros,ans+ch);
			
		} 
			
		}
	}


