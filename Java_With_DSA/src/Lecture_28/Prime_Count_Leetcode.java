package Lecture_28;

public class Prime_Count_Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		PrimeCount(n);

	}
	public static void PrimeCount(int n) {
		 boolean[] prime=new boolean[n+1];
			prime[0]=true;
			prime[1]=true;
			for(int i=2;i*i<=n;i++){
				if(prime[i]==false){
					for(int mul=2;mul*i<=n;mul++){
						prime[i*mul]=true;
					}
				}
			}
			//int count=0;
			for(int i=2;i<=n;i++){
				if(prime[i]==false){
					System.out.print(i+" ");
				}
			}
			//return count;
	
       }
	}
