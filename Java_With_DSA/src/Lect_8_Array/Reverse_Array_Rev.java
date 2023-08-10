package Lect_8_Array;
import java.util.*;
public class Reverse_Array_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		int [] arr= {1,3,5,7,8};
		Reverse(arr);
		for(int k=0;k<arr.length;k++) {
			//arr[k]=sc.nextInt();
			System.out.print(arr[k]+" ");
		}

	}
	public static void Reverse(int []arr) {
		int i=0;
		int j=arr.length-1;
			while(i<j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
	
			
		}
	}


