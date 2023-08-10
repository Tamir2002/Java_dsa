package Lecture_16_String;

public class _String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bye";
		String str1="Bye";
		System.out.println(equals(str,str1));
		

	}
  public static boolean equals(String str,String str1) {
	  if(str==str1) {
		  return true;
	  }
	  if(str1.length()!=str.length()) {
		  return false;
	  }
	  for(int i=0;i<str1.length();i++) {
		  if(str.charAt(i)!=str1.charAt(i)) {
			  return false;
		  }
	  }
	  return true;
  }
  }

