package Lect_8_Array;
import java.util.*;
public class Check_Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,0,0,1,1,0,1};
		Sort(arr);
		for(int i=0;i<arr.length;i++) {
			//arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		//Sort(arr);
//		for(int k=0;k<arr.length;k++) {
//			System.out.println(arr[k]+" ");
//		}
		

	}
	public static void Sort(int [] arr) {
		//pass
		for(int turn=1;turn<arr.length;turn++) {
			for(int i=0;i<arr.length-turn;i++) {//6-1
				if(arr[i]>arr[i+1]) {
					//arr[i]=arr[i+1];
					int t=arr[i];
				    arr[i]=arr[i+1];
				    arr[i+1]=t;	
				}
			}
		}
	}

}
