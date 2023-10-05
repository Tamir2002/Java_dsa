package Lecture_27_Recursion_Assignment_6;

public class Tower_Of_Hanoi_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=3;
		toh(n,"A","B","C");

	}
	public static void toh(int n,String src ,String hlp,String des) {
		
		if(n==0) {
			return;
		}
		toh(n-1,src,des,hlp);
		System.out.println("moving ring"+n +" from "+ src + " to"+des );
		toh(n-1,hlp,src,des);
	}

}
