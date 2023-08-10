package Lect_8_Array;

public class Max_Array_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,4,17,8,9};
		System.out.println(max (arr));
	}
	public static int max(int[] arr) {
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
		
	}

}
