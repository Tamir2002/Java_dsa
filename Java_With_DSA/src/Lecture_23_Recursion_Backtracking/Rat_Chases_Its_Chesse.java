package Lecture_23_Recursion_Backtracking;

import java.util.Scanner;

public class Rat_Chases_Its_Chesse {

	public static void main(String[] args) {
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
		if(cr<0||cc<0||cr>=maze.length||cc>=maze[0].length ||maze[cr][cc]=='x') {
			return;
		}
		maze[cr][cc]='x';
		
		
		ratemaze(maze,cr-1,cc,ans);// upward direction
		ratemaze(maze,cr+1,cc,ans);// downward direction
		ratemaze(maze,cr,cc-1,ans);//  left
		ratemaze(maze,cr,cc+1,ans);// right
		maze[cr][cc]='o';
		ans[cr][cc]=0;
	}
	public static void Display(int [][] ans) {
		for(int i=0;i<ans[0].length;i++) {
			
		}
	}

}
