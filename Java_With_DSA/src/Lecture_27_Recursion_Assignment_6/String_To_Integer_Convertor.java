package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class String_To_Integer_Convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		System.out.println(convertStringToInt(input));
 
	}
	public static int convertStringToInt(String input){
		if(input.length()<1)
		{
			return 0;
		}
		return input.charAt(input.length()-1)-'0'+(10*convertStringToInt(input.substring(0,input.length()-1)));
		
	}
}
