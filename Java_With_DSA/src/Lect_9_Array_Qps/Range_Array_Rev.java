package Lect_9_Array_Qps;

public class Range_Array_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,34,5,6,3,8,7,11,10,56};
		Reverse(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Reverse(int [] arr) {
		int i=2;
		int j=8;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
