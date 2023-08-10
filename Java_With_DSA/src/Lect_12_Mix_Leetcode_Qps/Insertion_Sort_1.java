package Lect_12_Mix_Leetcode_Qps;
import java.util.*;
public class Insertion_Sort_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();
		}
		Insertionsort(arr);
		Display(arr);
		}

	public static void Insertionsort(int arr[]) {
		for (int counter = 1; counter < arr.length; counter++) { // counter < n not n - 1
			int val = arr[counter];
			int j = counter - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

	public static void Display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");// same line with space
		}
	}
}