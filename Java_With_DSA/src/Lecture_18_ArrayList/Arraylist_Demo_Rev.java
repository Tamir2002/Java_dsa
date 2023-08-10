package Lecture_18_ArrayList;
import java.util.*;
public class Arraylist_Demo_Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list);
		
		//Add--- last me add karega
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		//add at  index
		//range 0 to size
		list.add(2,30);
		System.out.println(list);
		
		//System.out.println(list.size());
		
		// delete function
		// range 0 to size-1
		System.out.println(list.remove(1));
		System.out.println(list);
		
		list.add(60);
		list.add(-20);
		System.out.println(list);
		
		//get function
		//range 0 to size-1
		System.out.println(list.get(3));
		
		//set --->update index pe jake
		list.set(1, -5);
		System.out.println(list);
		
		//individuals array
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");//arr[i
		}
		System.out.println();
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		// E_F_LOOP--->Enhance for loop
		for(int val:list) {
			System.out.print(val+" ");
		}
		System.out.println();
		int []  arr= {10,20,30,40};
		for(int Tamir:arr) {
			System.out.print(Tamir+" ");
		}
		System.out.println();
		
		// 2d array Enhance for loop
	
	}

}
