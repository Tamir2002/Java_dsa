package Lectrue_26;
import java.util.Random;
public class Rand_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub       
		 int si=10;
		 int ei=50;
		 Random_Number(si,ei);
	}
	public static void Random_Number(int si,int ei) {
		Random rand=new Random();
		int lo=si;
		int hi=ei;
		for(int i=0;i<10;i++) {
			int ri=rand.nextInt(hi-lo+1)+lo;
			System.out.println(ri+" ");
		}
	}

}
 