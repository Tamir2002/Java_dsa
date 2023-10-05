package Lecture_21_String_Recursion_qps;

public class Coin_Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] coin= {2,3,5,6};
		int amount=10;
		printcombination(coin,amount,"",0);
	}
	public static void printcombination(int [] coin,int amount,String ans,int idx) {
		
		if(amount==0) {
			System.out.println(ans);
			return;
		}
		for(int i=idx;i<coin.length;i++) {
			if(amount>=coin[i]){
				printcombination(coin,amount-coin[i],ans+coin[i],i);
			}
		}
	}

}