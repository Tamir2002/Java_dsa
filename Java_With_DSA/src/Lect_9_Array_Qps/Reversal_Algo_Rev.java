package Lect_9_Array_Qps;

public class Reversal_Algo_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,3,2,4,5,6,7};
		int k=3;
		Rotate(arr,k);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Rotate(int [] arr,int k) {
		int n=arr.length;
		k=k%n;
		// starting k elment ko reverse
		Reverse(arr,0,n-k-1);
		//last ke k element ko reverse
		Reverse(arr,n-k,n-1);
		// whole ke element ko reverse
		Reverse(arr,0,n-1);
		
	}
	public static void Reverse(int [] arr,int i,int j) {
		while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
		
	}
	}

}
