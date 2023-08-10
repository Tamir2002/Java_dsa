package Lect_9_Array_Qps;

public class Revise_Reverse_Range_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,6,7,8,9,10};
		int i=2;
		int j=5;
		Reverse(arr,i,j);
		for(int k=0;k<arr.length;k++) {
			System.out.print(arr[k]+" ");
		}

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
