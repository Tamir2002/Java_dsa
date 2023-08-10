package Assignment_3;
import java.util.*;
public class Assi_3_Inverse_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
		int [] inverse=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[j]==i) {
					inverse[i]=j;
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(inverse[i]+" ");
		}
	}


}
