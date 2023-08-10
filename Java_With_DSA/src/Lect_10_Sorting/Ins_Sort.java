package Lect_10_Sorting;

public class Ins_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {8,9,4,2,1,11,89};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		

	}
	public static void Sort(int [] arr) {
		int N=arr.length;
		for(int i=1;i<N;i++) {
			int j=i-1;
			int item=arr[i];
			while(j>=0 && arr[j]>item) {
				arr[j+1]=arr[j];
				j--;
			}
			j++;
			arr[j]=item;
		}
	}

}
