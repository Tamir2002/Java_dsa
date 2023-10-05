package Lecture_27_Recursion_Assignment_6;

import java.util.Scanner;

public class Odd_Even_Using_Recursion {
	public static void odd_even_series(int n){
		if(n==0)
			return;
		if(n%2==0){
			odd_even_series(n-1);
			System.out.println(n);
		}
		else{
			System.out.println(n);
			odd_even_series(n-1);
		}
			
	}
    public static void main(String args[]) {
        // Your Code Here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		odd_even_series(n);
    }
}
