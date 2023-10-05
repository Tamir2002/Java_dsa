package Lecture_21_String_Recursion_qps;
import java.util.*;
public class Leet_Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {2,3,6,7};
		int amount=7;
		
		List<Integer> ll=new ArrayList<>();
		List<List<Integer>> ans=new ArrayList<>();
		printcombination(arr,amount,ll,0,ans);
		System.out.println(ans);
	}
public static void printcombination(int [] coin,int amount,List<Integer> ll,int idx,List<List<Integer>> ans) {
		
		if(amount==0) {
			//System.out.println(ll);
			ans.add(new ArrayList<>(ll));
			
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]){
				ll.add(coin[i]);
				printcombination(coin,amount-coin[i],ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}

}


