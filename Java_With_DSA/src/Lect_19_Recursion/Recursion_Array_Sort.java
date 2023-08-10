package Lect_19_Recursion;

public class Recursion_Array_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int  [] arr={2,13,7,5,3,4,5,6,3,9,3};
 System.out.println(firstIndex(arr,0,3));
	}
	public static int firstIndex(int[]arr,int i,int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		return firstIndex(arr,i+1,item);
	}

}
