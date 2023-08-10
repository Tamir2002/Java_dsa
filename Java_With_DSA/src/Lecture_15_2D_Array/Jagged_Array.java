package Lecture_15_2D_Array;
import java.util.*;
public class Jagged_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int [][] arr=new int[n][];
		for(int i=0;i<arr.length;i++) {
			int c=sc.nextInt();
			arr[i]=new int[c];
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		// print
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
