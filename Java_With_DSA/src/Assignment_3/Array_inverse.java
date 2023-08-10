package Assignment_3;

import java.util.Scanner;

public class Array_inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int [] inverse=new int [n];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==i) {
				inverse[i]=j;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		System.out.print(inverse[i]+" ");
	}

  }
}
