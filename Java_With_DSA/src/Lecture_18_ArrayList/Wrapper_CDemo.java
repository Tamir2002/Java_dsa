package Lecture_18_ArrayList;

public class Wrapper_CDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub a=100;
		
		Integer a=100;
		int a1=20;
		System.out.println(a);
		System.out.println(a1);
		Short s1=10;//class
		Byte b1=19;//class
		System.out.println(s1);
		System.out.println(b1);

		
		a=a1;
		System.out.println(a);
		Integer ii=10;
		int i=10;
		i=ii;
		System.out.println(i);
		
		
		//Question Imp
		Integer a2=19;
		Integer a3=19;
		System.out.println(a2==a3);
		Integer b2=190;
		Integer b3=190;
		System.out.println(b2==b3);
		
		
	}

}
