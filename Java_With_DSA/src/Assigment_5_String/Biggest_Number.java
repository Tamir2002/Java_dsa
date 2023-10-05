package Assigment_5_String;
import java.util.*;
public class Biggest_Number {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();
			int[] brr = new int[n];
			for (int i = 0; i < brr.length; i++) {
				brr[i] = sc.nextInt();
			}
			Sort(brr);
			for (int i = 0; i < brr.length; i++) {
				System.out.print(brr[i]);

			}
			System.out.println();
		}

	}

	public static void Sort(int[] brr) {

		// loop for pass wla
		for (int turn = 1; turn < brr.length; turn++) {

			for (int i = 0; i < brr.length - turn; i++) {// 6-1
				if (campare(brr[i], brr[i + 1]) > 0) {
					int t = brr[i];
					brr[i] = brr[i + 1];
					brr[i + 1] = t;
				}

			}

		}

	}

	public static int campare(int x1, int x2) {
		String s1 = "" + x1 + x2;// x1x2
		String s2 = "" + x2 + x1;// x2x1
		if (Long.parseLong(s2) > Long.parseLong(s1)) {
			return 1;
		} else {
			return -1;
		}

	}
}