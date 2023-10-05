package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Nth_Traingle_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(CountTriangle(n));
	}

	public static int CountTriangle(int n) {

		if (n == 0) {
			return 0;
		}
		int fn = CountTriangle(n - 1);
		return fn + n;
	}
}
