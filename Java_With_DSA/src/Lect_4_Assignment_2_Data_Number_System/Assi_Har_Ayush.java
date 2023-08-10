package Lect_4_Assignment_2_Data_Number_System;
import java.util.*;
public class Assi_Har_Ayush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	       // int count=1;

	        while(n>0){
	            int a = sc.nextInt();
	            int h = sc.nextInt();
	            int p=1;
	            while(true){
	             if(p%2!=0){
	               a= a-p;
	               p++;
	                if(a<0){
	                    System.out.println("Harshit");
	                    break;
	                }  
	            }else{
	                h = h-p;
	                p++;
	                if(h<0){
	                    System.out.println("Aayush");
	                    break;
	               }
	              }
	            }
	            n--;
	        }

	}

}
