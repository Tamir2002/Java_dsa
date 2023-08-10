package Lecture_15_2D_Array;

public class Rectangular_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int [][] arr= {{1,2,3,4},{5,6,7,8},{13,14,15,16}};
			SpiralPrint(arr);
		}
		public static void SpiralPrint(int [][] arr) {
			int minr=0;
			int maxr=arr.length-1;
			int minc=0;
			int maxc=arr[0].length-1;
			int total=arr.length*arr[0].length;
			int count=0;
			while(count<total) { // all matrix ke liye kam karega
		   
			for(int i=minc;i<=maxc&&count<total;i++) { 
				System.out.print(arr[minr][i]+" ");
				count++;
			}
			minr++;
			for(int i=minr;i<=maxr&&count<total;i++) {
				System.out.print(arr[maxc][i]+" ");
				count++;
			}
			maxc--;
			for(int i=maxc;i>=minc&&count<total;i--) {
				System.out.print(arr[maxr][i]+" ");
				count++;
			}
			maxr--;
			for(int i=maxr;i>=minr&&count<total;i--) {
				System.out.print(arr[minc][i]+" ");
				count++;
			}
			minc++;
			}
			
		}
		

	}
