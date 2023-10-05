package OOPS_Second;

import OOPS_2_First.Cars;

public class Cars_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars[] ar = new Cars[5];
		ar[0]=new Cars(200,10,"white");// price speed color
        ar[1]=new Cars(100,20,"Black");
        ar[2]=new Cars(345,3,"Yellow");
        ar[3]=new Cars(34,89,"Grey");
        ar[4]=new Cars(232,6,"Red");
        Display(ar);

	}
	public static <T extends Comparable<T>> void Sort(T [] arr) {
		for(int i=1;i<arr.length;i++) {// number of turn
			// working ke liye
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					T temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
			
	public static void Display(Cars[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);

		}
		System.out.println();
	}

	}
