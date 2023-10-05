package Lecture_20_String_Recursion;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="abca";
      PrintPermutation(str,"");
	}
	public static void PrintPermutation(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch=ques.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
			String rs=ques.substring(0,i)+ques.substring(i+1);
			PrintPermutation(rs,ans+ch);
		}
	  }
	}

}
