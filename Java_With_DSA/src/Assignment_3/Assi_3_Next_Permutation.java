package Assignment_3;
import java.util.*;
public class Assi_3_Next_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();

			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			NextPermutation(arr);
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			//NextPermutation(arr);
           	System.out.println();
			t--;
			//NextPermutation(arr);
		}

	}

	public static void NextPermutation(int[] arr) {
		int p = -1, q = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse(arr, 0, arr.length - 1);
			return;
		}
		for (int i = arr.length - 1; i > p; i--) {
			if (arr[p] < arr[i]) {
				q = i;
				break;
			}
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Reverse(arr, p + 1, arr.length - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

}