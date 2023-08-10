package Lect_9_Array_Qps;

public class Reverse_Rang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {4,5,1,2,8,9,10,7,80,89};
		Reverse(arr,2,7);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void  Reverse(int[] arr,int i,int j) {
//	 int i=2;
//	 int j=7;
	 while(i<j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	 }

	}

}
