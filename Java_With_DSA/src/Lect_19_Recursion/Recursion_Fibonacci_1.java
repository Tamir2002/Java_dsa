package Lect_19_Recursion;

public class Recursion_Fibonacci_1 {
 public static void main(String[] args) {
	int n=5;
	System.out.println(Fib(n));
 }
 public static int Fib(int n) {
	 if(n==0) {
		 return 0;
	 }
	 if(n==1) {
		 return 1;
	 }
	 int f1=Fib(n-1);
	 int f2=Fib(n-2);
	 return f1+f2;
 }
}
