package Lecture_20_String_Recursion;
import java.util.*;
public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n=2;
      // Parentheses(n,0,0,"");
       List<String> list=new ArrayList<>();
       Parentheses_Leetcode(n,0,0,"",list);
		System.out.println(list);
	}
   public static void Parentheses(int n,int opening,int closing,String ans) {
	  
	   if(opening==n&&closing==n) {
		    System.out.println(ans);
		    return;
	   }
	   if(opening<n) {
		   
	   
	   Parentheses(n,opening+1,closing,ans+"(");
	   }
	   if(closing<opening) {
	   Parentheses(n,opening,closing+1,ans+")");
	   }
   }
   public static void Parentheses_Leetcode(int n,int opening,int closing,String ans,List<String>list) {
		  
	   if(opening==n&&closing==n) {
		   // System.out.println(ans);
		   list.add(ans);
		    return;
	   }
	   if(opening<n) {
		   
	   
	   Parentheses_Leetcode(n,opening+1,closing,ans+"(",list);
	   }
	   if(closing<opening) {
	   Parentheses_Leetcode(n,opening,closing+1,ans+")",list);
	   }
   }
}
