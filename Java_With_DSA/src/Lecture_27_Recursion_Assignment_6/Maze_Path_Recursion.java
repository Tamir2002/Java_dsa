package Lecture_27_Recursion_Assignment_6;

import java.util.Scanner;

public class Maze_Path_Recursion {
    static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
     int m=sc.nextInt();
     int n=sc.nextInt();
     PrintPath(m,n,1,1,1,"");
     System.out.print("\n"+count);
     
	}
	public static void PrintPath(int er,int ec,int cr,int cc,int cd,String ans) {
		if(cc==ec && cr==er) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		PrintPath(er,ec,cr+1,cc,cd+1,ans+"V");
		PrintPath(er,ec,cr,cc+1,cd+1,ans+"H");
		PrintPath(er,ec,cr+1,cc+1,cd+1,ans+"D");
	}

}
   