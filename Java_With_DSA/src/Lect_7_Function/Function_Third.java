package Lect_7_Function;

public class Function_Third {
	static int val=100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hey");
		
		int a=8;
		int b=7;
		System.out.println(val);
		System.out.println(add(a, b));
		System.out.println(sub(a,b));
	      System.out.println(val);
	     // System.out.println();
		
	}
	public static int add(int a,int b) {
		int c=a+b;
		int val=90;
		Function_Third.val=val+5;
		return c;
	}
	public static int sub(int a,int b) {
		int c=a-b;
		int val=98;
		Function_Third.val=val+3;
		return c;
		
	}

}
