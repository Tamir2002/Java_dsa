package Assignment_3;
import java.util.*;
public class Assi_3_Insertion_Sort {

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
		for (int k = 1; k < arr.length; k++) { // counter < n not n - 1
			int val = arr[k];
			int j =  k- 1;
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