package Lect_7_Function;
import java.util.*;
public class Function_Arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(IsArmstrongNumber(n));
	}
	
	public static boolean IsArmstrongNumber(int n) {
		int m=countofdigit(n);
		int ans=0;
		int temp=n;
		while(n>0) {
			int rem=n%10;
			ans=(int)(ans+Math.pow(rem, m));
			n=n/10;
		}
		if(ans==temp) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int countofdigit(int n) {
		int c=0;
		while(n>0) {
			n=n/10;
			c++;
		}
		return c;
		
	}

}
