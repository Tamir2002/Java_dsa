package Lecture_20_String_Recursion;

public class Quick_Revision_Board_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		int n=4;
		 System.out.print("\n"+BoardPath(n,0,""));
		
	}
	public static int BoardPath(int end,int curr,String ans) {
		
		if(curr==end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>end) {
			return 0;
		}
		
		int fp=BoardPath(end,curr+1,ans+1);
		int sp=BoardPath(end,curr+2,ans+2);
		int tp=BoardPath(end,curr+3,ans+3);
		
		
		return fp+sp+tp;
	}

}
