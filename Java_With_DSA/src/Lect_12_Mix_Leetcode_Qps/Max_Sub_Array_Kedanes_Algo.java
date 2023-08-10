package Lect_12_Mix_Leetcode_Qps;

public class Max_Sub_Array_Kedanes_Algo {

		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
			System.out.print(MaxSum(arr));

		}
		public static int MaxSum(int [] arr) {
			int ans=Integer.MIN_VALUE;//-2^31  // infinity ke liye
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
				ans=Math.max(ans, sum);
				if(sum<0) {
					sum=0;
				}
			}
			return ans;
		}
		


}
