package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Tower_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner sc=new Scanner(System.in);
			int n= sc.nextInt();

			// A, B and C are names of rods
			towerOfHanoi(n, "A", "B", "C");
			}
	public static void towerOfHanoi(int n, String s,String h, String d)
{
if (n == 0) {
return;
}
towerOfHanoi(n - 1, s, d, h);
System.out.println("Moving ring " + n + " from " +s+ " to " +h);
towerOfHanoi(n - 1, d, h, s);
}



}


