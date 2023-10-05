package Lecture_23_Recursion_Backtracking;

public class Pallindrome_Partitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="nitin";
		 String ans="";
		Partitioning(str,ans);

	}
	public static void Partitioning(String ques,String ans) {
		if(ques.length()==0) {
		System.out.println(ans);
    }
		for(int i=1;i<ques.length();i++) {
			Partitioning(ques.substring(i),ans+ques.substring(0,i)+"|");
		
		}
  }
}
