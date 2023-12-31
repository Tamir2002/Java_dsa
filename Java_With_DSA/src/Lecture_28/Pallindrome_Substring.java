package Lecture_28;
import java.util.*;
public class Pallindrome_Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nitin";
		System.out.println(PalindromicSubstrings(str));

	}

	public static int PalindromicSubstrings(String str) {
		int count = 0;
		// odd
		for (int axis = 0; axis < str.length(); axis++) {
			for (int orbit = 0; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt(axis - orbit)== str.charAt(axis + orbit)) {
				 count++;
				}
				else {
					break;
				}
			}

		}
		// even
		for (double axis = 0.5; axis < str.length(); axis++) {
			for (double orbit = 0.5; axis - orbit >= 0 && axis + orbit < str.length(); orbit++) {
				if (str.charAt((int) (axis - orbit))==str.charAt((int) (axis + orbit))) {
				count++;
				}
				else {
					break;
				}
			}

		}
		return count;

	}
}
