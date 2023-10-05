package DP_2;

public class Knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] wt= {1,2,3,2,2};
		int [] val= {8,4,0,5,3};
		int cap=4;
		

	}
    public static int MaximumCost(int [] wt,int val,int cap,int i) {
    	
    	int inc=0,exc=0;
    	if(cap>=wt[i]) {
    		inc=val[i]+MaximumCost(wt,val,cap-wt[i],i+1);
    	})
    }
}
