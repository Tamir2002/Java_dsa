package Lecture_21_String_Recursion_qps;

import java.util.ArrayList;
import java.util.List;

public class Leet_Code_Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board=new boolean[4];
		int no_queen=2;// n is no of queen
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		Queen(board,no_queen,0,0,ll,ans);
		System.out.println(ans);
		
	}
	public static void Queen(boolean[] board,int tq,int qpsf,int idx,List<Integer> ll,List<List<Integer>> ans) {
		//tq-->total queen
		// qps-->queen place so far
		if(tq==qpsf) {
			//System.out.println(ll);
			ans.add(new ArrayList<Integer>(ll));
			return;
		}
		for(int i=idx;i<board.length;i++) {
			if(board[i]==false) {// queen place nhi hai
				board[i]=true;// queen place
				ll.add(i+1);
				Queen(board,tq,qpsf+1,i+1,ll,ans);
				ll.remove(ll.size()-1);
				board[i]=false;//undo
			}
		}
		
		
	}

}
