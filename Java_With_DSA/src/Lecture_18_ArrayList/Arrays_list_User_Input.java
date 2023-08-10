package Lecture_18_ArrayList;
import java.util.*;
public class Arrays_list_User_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		ArrayList<Integer> ll=new ArrayList<>();
		for(int i=0;i<4;i++) {
			ll.add(sc.nextInt());
		}
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));// arr[i]
			// Arraylist sort karna h to
			//Collection.sort(list);
		}
	}

}
