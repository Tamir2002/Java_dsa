package Lecture_16_String;

public class String_Demo_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String str1="Bye";
		String s=str+str1;// string s=str.concat(str1)
		String s1=str+"Bye";// heap me aayega
		String s2="Bye"+str;// heap me aayega
		String s3="hello"+"bye";
		String s4="hello"+"bye";
		System.out.println(s3==s4);
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.charAt(2));

	}

}
