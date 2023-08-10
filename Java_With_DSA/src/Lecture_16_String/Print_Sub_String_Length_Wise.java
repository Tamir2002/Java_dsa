package Lecture_16_String;

public class Print_Sub_String_Length_Wise {
	public static void main(String[] args) {
		String s="7182";
		print(s);
		
	}
	public static void print(String s) {
		for(int len=1;len<s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				
				int i=j-len;
				System.out.println(s.substring(i,j));
			}
		}
	}
	

}
