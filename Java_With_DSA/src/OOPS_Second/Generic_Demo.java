package OOPS_Second;

public class Generic_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,20,40,50,60};
		Display(arr);
		String[]arr1={"Tamir","Alam","Ankit","Sharma"};
		Display(arr1);

	}
	public  static <T> void Display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
		System.out.println();
	}

}
