package Assignment_3;
import java.util.*;
public class Assi_3_Von_Neoumons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		while(n>0) {
			long sum=0;
		long mul=1;
		long m=sc.nextLong();
	    while(m>0) {
			long rem=m%10;
			sum=sum+rem*mul;
			mul=mul*2;
			m=m/10;
			
			}
	    System.out.println(sum);
	    n--;
		}

	}

}
