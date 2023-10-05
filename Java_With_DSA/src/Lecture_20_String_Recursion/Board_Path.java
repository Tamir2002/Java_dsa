package Lecture_20_String_Recursion;

public class Board_Path {

	public static void main(String[] args) {
     int n=3;
     System.out.println("\n"+BoardPath1(n,0,""));
	}
	public static int BoardPath(int end,int curr, String ans) {
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
	// 2nd way
	public static int BoardPath1(int end,int curr, String ans) {
		if(curr==end) {
			System.out.print(ans+" ");
			return 1;
		}
		if(curr>end) {
			return 0;
		}
//		int fp=BoardPath1(end,curr+1,ans+1);
//		int sp=BoardPath1(end,curr+2,ans+2);
//		int tp=BoardPath1(end,curr+3,ans+3);
		int count=0;
		for(int dice=1;dice<=3;dice++) {
			count=count+BoardPath1(end,curr+dice,ans+dice);
		}
		return count;
	}
	
	

}
