package Lect_12_Mix_Leetcode_Qps;

public class Maximum_Sub_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
		MaxSum(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int MaxSum(int [] arr) {
		int ans=Integer.MIN_VALUE;//-2^31
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				ans=Math.max(ans,sum);
			}
		}
		return ans;

}
}