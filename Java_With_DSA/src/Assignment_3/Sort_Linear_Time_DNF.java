package Assignment_3;
import java.util.*;
public class Sort_Linear_Time_DNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr) {
		int i = 0;// zero ka index
		int j = arr.length - 1;// 2 ka index ka
		int k = 0;
		while (k <= j) {
			if (arr[k] == 0) {
				int temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				i++;
				k++;

			} else if (arr[k] == 2) {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j--;

			} else {
				k++;
			}

		}

	}

}