package Lecture_15_2D_Array;
import java.util.*;
public class Assi_4_Row_Wise_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		 int [][] m =new int [row][col]; 
		 for(int i=0;i<m.length;i++) {
			 for(int j=0;j<m.length;j++) {
				 m[i][j]=sc.nextInt();
				 
			 }
		 }
   sortRowWise(m);
	}
		// TODO Auto-generated method stub
		static int sortRowWise(int [][] m)
	    {
	        // loop for rows of matrix
	        for (int i = 0; i < m.length; i++) {
	 
	            // loop for column of matrix
	            for (int j = 0; j < m[i].length; j++) {
	 
	                // loop for comparison and swapping
	                for (int k = 0; k < m[i].length - j - 1; k++) {
	                    if (m[i][k] > m[i][k + 1]) {
	 
	                        // swapping of elements
	                        int t = m[i][k];
	                        m[i][k] = m[i][k + 1];
	                        m[i][k + 1] = t;
	                    }
	                }
	            }
	        }
	 
	        // printing the sorted matrix
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[i].length; j++)
	                System.out.print(m[i][j] + " ");
	            System.out.println();
	        }
	 
	        return 0;
	    }
	 
	    // driver code
	   
	}