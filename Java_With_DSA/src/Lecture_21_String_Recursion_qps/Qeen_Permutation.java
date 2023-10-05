package Lecture_21_String_Recursion_qps;

public class Qeen_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		boolean [] board=new boolean[4];
		int n=2;// n is no of queen
		Queen(board,n,0,"");
		
	}
	public static void Queen(boolean[] board,int tq,int qpsf,String ans) {
		//tq-->total queen
		// qps-->queen place so far
		if(tq==qpsf) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++) {
			if(board[i]==false) {// queen place nhi hai
				board[i]=true;// queen place
				Queen(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf+" ");
				board[i]=false;//undo
			}
		}
		
		
	}

}
