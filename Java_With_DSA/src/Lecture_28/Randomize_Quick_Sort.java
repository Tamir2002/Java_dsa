package Lecture_28;
import java.util.Random;
public class Randomize_Quick_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {5,7,2,3,8,1,4};
		Sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static void Sort(int [] arr,int si,int ei) {
		if(si>=ei) {
			return;
		}
		RandomIndexSwapping(arr,si,ei);
		int idx=Partition(arr,si,ei);
		Sort(arr,si,idx-1);
		Sort(arr,idx+1,ei);
	}
	public static void RandomIndexSwapping(int [] arr,int si,int ei) {
		Random rand=new Random();
		int rn = rand.nextInt(ei - si + 1) + si;
		int temp = arr[rn];
		arr[rn] = arr[ei];
		arr[ei] = temp;

	}
	public static int Partition(int [] arr,int si,int ei) {
		int item=arr[ei];
		int pi=si;
		for(int i=si;i<ei;i++) {
			if(arr[i]<item) {
				int temp=arr[pi];
				arr[pi]=arr[i];
				arr[i]=temp;
				pi++;
			}
		}
		int temp=arr[pi];
		arr[pi]=arr[ei];
		arr[ei]=temp;
		return pi;
		
	
		
	
}

}
