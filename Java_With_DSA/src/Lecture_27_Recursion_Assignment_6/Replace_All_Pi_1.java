package Lecture_27_Recursion_Assignment_6;
import  java.util.*;
public class Replace_All_Pi_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
          String input=sc.next();
       String ans1=replace(input);
       System.out.println(ans1);
	}
	}
	 public static String replace(String input)
	    {
	        if(input.length()==1 || input.length()==0)
	            return input;
	        String smallans=replace(input.substring(1));
	        if(smallans.charAt(0)=='i' && input.charAt(0)=='p')
	            smallans="3.14" + smallans.substring(1);
	        else
	            smallans=input.charAt(0)+smallans;
	        return smallans;

	    }
}
