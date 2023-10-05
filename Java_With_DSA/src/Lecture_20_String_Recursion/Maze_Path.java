package Lecture_20_String_Recursion;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int m=3;
     int n=3;
     PrintPath(m-1,n-1,0,0,"");
     
	}
	public static void PrintPath(int er,int ec,int cr,int cc,String ans) {
		
		if(cc==ec && cr==er) {
			System.out.print(ans+" ");
			return;
		}
		if(cc>ec || cr>er) {
			return;
		}
		PrintPath(er,ec,cr,cc+1,ans+"H");
		PrintPath(er,ec,cr+1,cc,ans+"V");
	}

}
