package Lecture_25_String_Builder;

public class String_Builder_Demo_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
		StringBuilder sb=new StringBuilder("HelloHello");
		System.out.println(sb.capacity());
		System.out.println(sb.charAt(2));
		System.out.println(sb.substring(2,5));
		
		//StringPrint();
		//StringBuilder();
		
	}
	public static void StringPrint() {
		
		String s="";
		
		for(int i=1;i<=100000;i++) {
			s=s+i;
			
		}
		System.out.println(s);
	}
	public static void StringBuilder() {
		StringBuilder s=new StringBuilder();
		for(int i=1;i<=100000;i++) {
			s=s.append(i);
			
		}
		System.out.println(s);
	}

}
