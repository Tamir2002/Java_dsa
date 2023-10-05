package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Board_Path_Recursion {
 static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
	    BoardPath(n,0,"");
	    System.out.println("\n"+count);
		}
		public static void BoardPath(int end,int curr, String ans) {
			if(curr==end) {
				System.out.print(ans+" ");
				count++;
				return;
			}
			if(curr>end) {
				return;
			}
		        BoardPath(end,curr+1,ans+1);
			    BoardPath(end,curr+2,ans+2);
			    BoardPath(end,curr+3,ans+3);
			return;
		
		// 2nd way
	
		}
		
		

	}
