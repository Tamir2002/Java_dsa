package Lecture_27_Recursion_Assignment_6;

public class Count_Remove_And_ReplacePart_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="abchihitfhi";
	}
	public static int count(String s) {
		if(s.length()<=1) {
			return 0;
			
		}
		int anns=0;
		String s1=s.substring(0,2);
		if(!s1.equals("hi")){
			ans=ans+count(s.substring(1));
			
		}	
		else if(s1.equals("hi")&&s.length()>=3&&s.charAt(2)=='t') {
			
		}
		
	}

}
