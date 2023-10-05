package Lecture_27_Recursion_Assignment_6;
import java.util.*;
//import java.util.ArrayList;
import java.util.List;

public class Generate_Parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
	       Parentheses(n,0,0,"");
	       //List<String> list=new ArrayList<>();
//	       Parentheses_Leetcode(n,0,0,"",list);
//			System.out.println(list);
		}
	   public static void Parentheses(int n,int opening,int closing,String ans) {
		  
		   if(closing==n) {
			    System.out.println(ans);
			    return;
		   }
		   if(opening>closing) {
		   Parentheses(n,opening,closing+1,ans+")");
		   }
		   if(opening<n) {
		   Parentheses(n,opening+1,closing,ans+"(");
		      }
	        }
	   	 }
	
