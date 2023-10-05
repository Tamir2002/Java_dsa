package Lecture_27_Recursion_Assignment_6;
import java.util.*;
public class Replace_0_With_5_assi {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int num =sc.nextInt();
	        System.out.println(convert0To5(num));
	     }
		// TODO Auto-generated method stub
	public static int reverseTheNumber(int temp)
		{
		    int ans = 0;
		    while (temp > 0) {
		        int rem = temp % 10;
		        ans = ans * 10 + rem;
		        temp = temp / 10;
		    }
		    return ans;
		}
		 
	  public static int convert0To5(int num)
		{
		    // if num is 0 return 5
		    if (num == 0) {
		        return 5;
		    }
		    else {
		        int temp = 0;
		 
		        while (num > 0) {
		            int digit = num % 10;
		           
		            //if digit is 0, make it 5
		            if (digit == 0)
		                digit = 5;
		 
		            temp = temp * 10 + digit;
		            num = num / 10;
		        }
		        return reverseTheNumber(temp);
		    }
		}
	}
