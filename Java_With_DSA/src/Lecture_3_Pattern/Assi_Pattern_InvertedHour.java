package Lecture_3_Pattern;
import java.util.*;
public class Assi_Pattern_InvertedHour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-1;
         int a=n;
        while(row<=2*n+2/2){
            int i=0;
            int val=n;
            while(i<star){
                System.out.print(val+" ");
                i++;
                val--;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            if(row==n+1) {
            	k=2;
            }
            int val2=a;
            while(k<=star){
                System.out.print(val2+" ");
                k++;
                val2++;
            }
            if(row<=2*n/2){
                   star++;
           space-=2;
           a--;
            }
       
        else{
               star--;
           space+=2;
           a++;
        }
             
            System.out.println();
            row++;
         
        }
	  }


	}
