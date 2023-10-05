package Lect_HashMap;
import java.util.*;
public class Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] arr1= {1,2,2,1};
    int [] arr2= {1,2,2,1,6,7,8,9};
    System.out.println(Intersection_Of_Two_Arrays(arr1,arr2));
    
	}
	
	public  static int [] Intersection_Of_Two_Arrays(int []arr1,int [] arr2)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		for (int i = 0; i < arr1.length; i++) {
			if(map.containsKey(arr1[i]))
			{
				map.put(arr1[i], map.get(arr1[i])+1);
			}
			else {
				map.put(arr1[i],1);
			}
			
		}
		ArrayList<Integer>list=new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			
			if(map.containsKey(arr2[i])&&map.get(arr2[i])>0) {
				list.add(arr2[i]);
				map.put(arr2[i], map.get(arr2[i])-1);
			}
			
		}
		int [] ans=new int[list.size()];
		for (int i = 0; i < ans.length; i++) {
			ans[i]=list.get(i);
			
			
		}
		return ans;
	}

}
