package Lecture_3_Pattern;
import java.util.*;
public class Double_Sided_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// initial
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = n - 1;
		int space2 = -1;
		int a = 1;
		// loop
		while (row <= n) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("  ");
				i++;
			}
			// star
			int k = 1;
			int var = a;
			while (k <= star) {
				System.out.print(var+" ");
				k++;
				var--;
			}
			// space2
			int l = 1;
			if (row == 1) {
				l = 0;
			}
			while (l <= space2) {
				System.out.print("  ");
				l++;
			}
			// star
			int j = 1;
			if (row==1 || row==n) {
				j = 2;
			}
			int var2=1;
			while (j <= star) {
				System.out.print(var2+" ");
				j++;
				var2++;
			}

			if (row <= n / 2) {
				star++;
				space -= 2;
				space2 += 2;
				a++;

			} else {
				star--;
				space += 2;
				space2 -= 2;
				a--;
			}
			row++;
			System.out.println();
		}

	}

}
