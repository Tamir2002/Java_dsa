package Lect_12_Mix_Leetcode_Qps;

public class Rain_water_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] N1={3 , 0,  0 , 2 , 0 , 4};
		int [] N= {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.print(Water(N));
		

	}
	public static int Water(int [] N) {
		int [] left=new int[N.length];
		left[0]=N[0];
		for(int i=1;i<left.length;i++) {
			left[i]=Math.max(left[i-1],N[i]);
		}
		int [] right=new int[N.length];
		right[N.length-1]=N[N.length-1];
		for(int i=N.length-2;i>=0;i--) {
			right[i]=Math.max(right[i+1], N[i]);
		}
		int sum=0;
		for(int i=0;i<right.length;i++) {
			sum=sum+Math.min(left[i], right[i]) -N[i];
		}
		return sum;
	}

}
