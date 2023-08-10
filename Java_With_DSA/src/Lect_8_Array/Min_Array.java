package Lect_8_Array;

public class Min_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,23,34,-45,-6,78};
		Minimum(arr);
		System.out.println(Minimum(arr));

	}
	public static int Minimum(int [] arr) {
		  int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		return min;

	}
	//return -1;

}
