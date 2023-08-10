package Lect_19_Recursion;

public class First_Times_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {2,13,7,5,3,4,5,6,3,9,3};
		System.out.println(FirstIndex(arr,0,3));
	}
	public static int FirstIndex(int[] arr,int i,int item) {
		if(i==arr.length) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
	
	return FirstIndex(arr,i+1,item);
	}
}
