package Assignment_3;

import java.util.Arrays;
import java.util.Scanner;

public class Assi_3_Triple_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		//int n = arr.length;
		int sum=sc.nextInt();
		Arrays.sort(arr);
		findTriplets(arr, sum);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
	}
		// TODO Auto-generated method stub
	public  static void findTriplets(int arr[], int sum)
{
for (int a=0;a < arr.length - 2; a++) {
	
for (int b=a + 1;b < arr.length - 1; b++) {
	
for (int c=b + 1; c < arr.length; c++) {
	   
       if (arr[a] + arr[b] + arr[c]==sum) {
           System.out.println(arr[a] + "," + arr[b]+ " and " + arr[c]);
       }
     }
    }
   }
 }
}
