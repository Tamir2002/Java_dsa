package Assigment_5_String;
import java.util.*;
public class Compare_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(Compare(s1, s2));
		System.out.println(s1.compareTo(s2));

	}

	public static int Compare(String s1, String s2) {

		int n = Math.min(s1.length(), s2.length());
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) > s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			} else if (s1.charAt(i) < s2.charAt(i)) {
				return s1.charAt(i) - s2.charAt(i);
			}
		}
		return s1.length() - s2.length();

	}

}