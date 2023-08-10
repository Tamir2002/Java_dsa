package Lecture_18_ArrayList;
import java.util.*;
public class Arrays_Sum_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	//int m=sc.nextInt();
	int []arr=new int[n];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}

	int m=sc.nextInt();
	int []brr=new int[m];
	for(int j=0;j<brr.length;j++) {
		brr[j]=sc.nextInt();
	}
	SumOfTwoArray(arr,brr);
	}
	public static void SumOfTwoArray(int [] arr,int[] brr) {
		ArrayList<Integer>ll=new ArrayList<>();
		int i=arr.length-1;
		int j=brr.length-1;
		int carry=0;
		while(i>=0&&j>=0) {
			int sum=arr[i]+brr[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
			j--;
		}
		while(i>=0) {
			int sum=arr[i]+carry;
			ll.add(sum%10);
			carry=sum/10;
			i--;
		}
		while(j>=0) {
			int sum=brr[j]+carry;
			ll.add(sum%10);
			carry=sum/10;
			j--;
		}
		if(carry!=0) {
		 ll.add(carry);	
		}
		for(int k=ll.size()-1;k>=0;k--) {
			System.out.print(ll.get(k)+", ");
		}
		System.out.println("END");
	}

}
