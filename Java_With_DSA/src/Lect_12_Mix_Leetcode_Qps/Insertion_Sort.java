package Lect_12_Mix_Leetcode_Qps;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,5,6,1};
		Insert_Position(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void Insert_Position(int [] arr) {
		int item=arr[arr.length-1];
		int i=arr.length-2;
		while(i>=0&&arr[i]>=item) {
			arr[i+1]=arr[i];
			i--;
		}
		i=i+1;
		arr[i]=item;
		
		
	}

}
