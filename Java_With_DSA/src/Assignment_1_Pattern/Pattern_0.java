package Assignment_1_Pattern;
import java.util.*;
public class Pattern_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
       int i=1;
        int a=5;
        int row=1;
     while(row<=n) {
        while(row<=n){
            System.out.print(a+" ");
            i++;
            a--;
        }   
        System.out.println();
        row++;
     }
     

	}

}
