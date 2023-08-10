package Lecture_16_String;

public class String_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String str1="Hello";
		String str2=new String("Hello");
		String str3=new String("Hello");
		System.out.println(str);
		System.out.println(str==str1);// true due to in pole 
		System.out.println(str==str3);// false due to out of pole
	   System.out.println(str1.equals(str2));// true
		

	}

}
