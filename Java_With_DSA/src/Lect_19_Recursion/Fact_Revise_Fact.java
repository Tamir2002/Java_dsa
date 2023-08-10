package Lect_19_Recursion;

public class Fact_Revise_Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        System.out.println(fact(n));
		
	}
	public static int fact(int n) {
		// smaller problem sp=n-1
		int f=fact(n-1);
		return f*n;
		
	}

}
