package Lect_9_Array_Qps;

public class Revise_Minimum_Element_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,2,4,-7,8,-34,6};
  System.out.print(Min(arr));
	}
	public static  int Min(int [] arr) {
		int min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}

}
