package Assignment_3;
//import java.util.Arrays;
import java.util.Scanner;

public class Assii_Target_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[] = new int[N];
		int n = arr.length;
		for(int i=0;i<arr.length;i++) {
			//System.out.println(arr[i]+" ");
			arr[i]=sc.nextInt();
		}
		findTriplets(arr, n,arr.length);
		for(int k=0;k<arr.length;k++) {
			System.out.println(arr[k]+" ");
		}
		//System.out.print(findTriplets(arr,n,arr.length));
//	
		}
		//}
		// TODO Auto-generated method stub
   static void findTriplets(int arr[],int n, int sum){
for (int i = 0;i < n - 2; i++) {
for (int j = i + 1;j < n - 1; j++) {
   for (int k = j + 1;k < n; k++) {
       if (arr[i] + arr[j] + arr[k] == sum) {
           System.out.println(arr[i] + " " + arr[j]+ " " + arr[k]);
       }
   }
   }
  }
 }
}
