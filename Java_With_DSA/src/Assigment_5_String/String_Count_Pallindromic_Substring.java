package Assigment_5_String;
import java.util.*;
public class String_Count_Pallindromic_Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				if(palindrome(s,i,j-1))
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}
	public static boolean palindrome(String s,int i,int j)
	{
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
}