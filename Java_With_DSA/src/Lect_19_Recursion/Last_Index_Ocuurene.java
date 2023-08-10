package Lect_19_Recursion;

public class Last_Index_Ocuurene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr= {12,1,3,3,4,5};
		System.out.println(LastIndex(arr,0,1));
		
	}
	public static int LastIndex(int [] arr,int i,int item) {
		
		if(i==-1) {
			return -1;
		}
		if(arr[i]==item) {
			return i;
		}
		 return LastIndex(arr,i-1,item);
	}

}
