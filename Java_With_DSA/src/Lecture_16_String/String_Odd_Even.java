package Lecture_16_String;
import java.util.*;
public class String_Odd_Even {

	public static void main(String args[]){
	    String s;
	    Scanner in=new Scanner(System.in);
	    s=in.nextLine();
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)%2==0){
	            System.out.print(s.charAt(i));

	        }

	       if(s.charAt(i)%2!=0){
	             System.out.print(s.charAt(i));
	       }
	    }
}
}
