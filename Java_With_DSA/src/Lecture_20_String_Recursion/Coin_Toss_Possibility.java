package Lecture_20_String_Recursion;

public class Coin_Toss_Possibility {
	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stubint 
//		int count=0;
		int n=3;
		CoinToss(n,"");
		

	}
	public static void CoinToss(int n,String ans) {
		
		if(n==0) {
			System.out.print(ans+" ");
			//count++;
			return;
		}
		count++;
		
		CoinToss(n-1,ans+"H");
		CoinToss(n-1,ans+"T");
	}

}
