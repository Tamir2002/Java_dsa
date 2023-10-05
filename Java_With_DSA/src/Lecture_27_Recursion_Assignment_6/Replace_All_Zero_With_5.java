package Lecture_27_Recursion_Assignment_6;

public class Replace_All_Zero_With_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5003802;
		int count=0;
		int d;
		int num=n;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		int [] arr=new int[count];
		int i=count-1;
		while(n>0) {
			d=n%10;
			n=n/10;
			if(d==0) 
				d=5;
				arr[i--]=d;
			}
			for(int j=0;j<count;j++) {
				System.out.print(arr[j]+" ");
			}
		}

	}


