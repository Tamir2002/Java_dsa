package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Replace_Hi {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.next();
        remove(s,"","");
    }
    static int h=0;
    public static void remove(String s,String s1,String s2){
        if(s.length()<2){
            System.out.println(h);
            System.out.println(s1+s);
            System.out.println(s2+s);
            return;
        }
        if((s.charAt(0)=='h'&&s.charAt(1)=='i')&&(s.length()<3||s.charAt(2)!='t')){
            h++;
            remove(s.substring(2),s1,s2+"bye");
        }
        else{
            remove(s.substring(1),s1+s.charAt(0),s2+s.charAt(0));
        }
    }
		
}


