package Lect_10_Sorting;

public class StringDemo {
	public static void main(String[] args) {
		String str="hello";
		String str1="hello";
		String st=new String("hello");
		String st1=new String("hello");
		System.out.println(st1==st);// address
		System.out.println(st1.equals(st)); //content
	   System.out.println(str==str1);
	   System.out.println(str==st);
	   String s1="hell";
	   s1=s1+"o";
	   String s="hell"+"o";
	   System.out.println(str==s);
		
	}

}
