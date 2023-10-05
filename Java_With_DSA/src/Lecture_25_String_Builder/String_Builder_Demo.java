package Lecture_25_String_Builder;

public class String_Builder_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		System.out.println(sb);
		sb.append("Hello");
		System.out.println(sb);
		System.out.println(sb.length());
		sb=sb.reverse();
		System.out.println(sb);
		System.out.println();
		sb.append("Hellooo");
		sb.append("HelloHelloHelloooo");
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		String s=sb.toString();// builder to string conversion
		System.out.println(sb);
		System.out.println(s);
		//System.out.println(sb.reverse());
		System.out.println(sb.capacity());
	}

}
