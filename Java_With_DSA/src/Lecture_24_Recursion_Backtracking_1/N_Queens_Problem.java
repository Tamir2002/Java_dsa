package Lecture_24_Recursion_Backtracking_1;
import java.util.*;
public class N_Queens_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  n=sc.nextInt();
		boolean  [][] board=new boolean[n][n];

	Queen(board,0,n);

	}
	public static void Queen(boolean[][] board,int row,int tq) {
		if(tq==0) {
			Display(board);
			return;
		}
		for(int col=0;col<board.length;col++) {
			if(issafe(board,row,col)==true) {
				board[row][col]=true;
				Queen(board,row+1,tq-1);
				board[row][col]=false;
			}
		}
	}
	public static boolean issafe(boolean[][] board,int row,int col) {
		// upper case
		int r=row;
		while(r>=0) {
			if(board[r][col]==true) {
				return false;
			}
			r--;
		}
		// left diagonal
		r=row;
		int c=col;
		while(r>=0&&c>=0) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c--;
		}
		//right
		r=row;
		 c=col;
		while(r>=0&&c<=board.length) {
			if(board[r][c]==true) {
				return false;
			}
			r--;
			c++;
		}
		return true;
	}
	public static void Display(boolean[][] board) {
		for(int i=0;i<board.length;i++) {
			for(int j=0;j<board.length;j++) {
				System.out.println(board[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
