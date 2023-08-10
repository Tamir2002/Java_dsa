package Lect_19_Recursion;

public class Recursion_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=2;
		int b=3;
		System.out.println(Pow(a,b));

	}
	public static int Pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		 int p=Pow(a,b-1);
		 return p*a;
	}

}
