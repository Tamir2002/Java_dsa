package Lecture_27_Recursion_Assignment_6;

import java.util.Scanner;

public class Rate_In_Maze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		char [][] maze=new char[n][m];
		for(int i=0;i<maze.length;i++) {
			String s=sc.next();
			for(int j=0;j<s.length();j++) {
				maze[i][j]=s.charAt(j);
			}
		}
		int [][] ans=new int[n][m];
		ratemaze(maze,0,0,ans);

	}
	public static void ratemaze(char [][] maze,int cr,int cc,int [][] ans) {
		if (cc == maze[0].length - 1 && cr == maze.length - 1) {
			if (maze[cr][cc] == 'O') {
//                f=true;
				ans[cr][cc] = 1;
				Display(ans);
				ans[cr][cc] = 0;
			}
			return;
		}
		if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length ||maze[cr][cc]=='x') {
			return;
		}
		maze[cr][cc]='x';
		
		
//		ratemaze(maze,cr-1,cc,ans);// upward direction
		ratemaze(maze,cr+1,cc,ans);// downward direction
		//ratemaze(maze,cr,cc-1,ans);//  left
		ratemaze(maze,cr,cc+1,ans);// right
		maze[cr][cc]='o';
		ans[cr][cc]=0;
	}
	public static void Display(int [][] ans) {
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[0].length; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();

		}

	}
}
