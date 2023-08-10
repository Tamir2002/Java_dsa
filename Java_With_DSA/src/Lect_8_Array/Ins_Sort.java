package Lect_8_Array;

public class Ins_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,3,5,6,9};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
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
