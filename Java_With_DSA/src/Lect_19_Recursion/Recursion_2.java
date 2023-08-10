package Lect_19_Recursion;

public class Recursion_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		PD(n);

	}
	public static void PD(int n) {
		if(n==6) {
			return;
		}
		System.out.println(n);
		PD(n+1);
	}

}
