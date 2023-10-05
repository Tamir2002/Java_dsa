package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Split_Array_Problem_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(SubSet(arr, 0, "", 0, "", 0));
	}

	public static int SubSet(int[] arr, int i, String ans1, int sum1, String ans2, int sum2) {
		if (i == arr.length) {
			if (sum1 == sum2) {
				System.out.println(ans1 + "and " + ans2);
				return 1;
			}
			return 0;
		}
		int a=SubSet(arr, i + 1, ans1 + arr[i] + " ", sum1 + arr[i], ans2, sum2);
		int b=SubSet(arr, i + 1, ans1, sum1, ans2 + arr[i] + " ", sum2 + arr[i]);
		return a+b;
	}
}
