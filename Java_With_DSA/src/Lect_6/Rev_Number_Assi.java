package Lect_6;
import java.util.*;
public class Rev_Number_Assi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int pos=1;
		while(n>0) {
			int rem=n%10;
			sum=(int)(sum+pos*Math.pow(10, rem-1));
			n=n/10;
			pos++;
		}
		System.out.println(sum);

	}

}
