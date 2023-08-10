package Lect_19_Recursion;

public class Fibonacci_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=5;
        System.out.println(Fibo(n));
	}
	public static int Fibo(int n) {
		if(n==0||n==1) {
			return n;
		}
		
		int fn=Fibo(n-1);
				
		int fn1 =Fibo(n-2);
		return fn+fn1;
	}

}
