package Lecture_27_Recursion_Assignment_6;
import java.util.Scanner;
import java.util.ArrayList;
public class Board__Path_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		ArrayList<String> ans = getboardpath(0, N, M);
		//System.out.println(ans.size());
		for (int i = 0; i < ans.size(); i++) {
			System.out.print(ans.get(i) + " ");
		}
		System.out.println("\n"+ans.size());
	}

	public static ArrayList<String> getboardpath(int curr, int end, int M) {
		if (curr == end) {
			ArrayList<String> baseres = new ArrayList<>();
			baseres.add("");
			return baseres;
		}
		ArrayList<String> myres = new ArrayList<>();
		for (int dice = 1; dice <= M && curr + dice <= end; dice++) {
			ArrayList<String> rr = getboardpath(curr + dice, end, M);

			for (String val : rr) {
				myres.add(dice + val);
			}

		}
		return myres;

	}

}
