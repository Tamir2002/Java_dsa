package Lecture_20_String_Recursion;

public class Tower_Of__Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int n=4;
		printStep(n,"A","B","C");
	}
	public static void printStep(int n,String s ,String h,String d) {
		
		// s is src h is helper and d is destination
		// s-->A h-->B d-->C
		
		if(n==0) {
			return;
		}
		printStep(n-1,s,d,h);// helper
		System.out.println("Move"+n+"th disk from "+s+" to "+d);
		printStep(n-1,h,s,d);
	}

}
