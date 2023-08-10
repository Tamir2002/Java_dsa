package Lect_12_Mix_Leetcode_Qps;

public class Kedanes_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Kedanes(arr));

	}
	public static int Kedanes(int [] arr) {
		int ans=Integer.MIN_VALUE;
		int presum=0;
		for(int i=0;i<arr.length;i++) {
			presum=presum+arr[i];
			ans=Math.max(ans, presum);
			if(presum<0) {
				presum=0;
			}
		}
		return ans;
	}

}
