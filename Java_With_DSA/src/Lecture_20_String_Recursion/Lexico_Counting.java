package Lecture_20_String_Recursion;
import java.util.*;
public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printcount(0,n);
	}
	public static void printcount(int curr,int end) {
		if(curr>end) {
			return;
		}
		System.out.print(curr+" ");
		int i=0;
		if(curr==0) {
			i=1;
		}
		
		for(;i<=9;i++) {
			printcount(curr*10+i,end);
		}
	}

}
