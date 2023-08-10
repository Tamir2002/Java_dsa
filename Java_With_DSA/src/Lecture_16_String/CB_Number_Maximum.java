package Lecture_16_String;

public class CB_Number_Maximum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="81615";
    System.out.println(PrintSubstring(str));
	}
   public static int PrintSubstring(String str) {
	   int count=0;
	   boolean [] visited=new boolean[str.length()];
	   for(int len=0;len<=str.length();len++) {
		   
		   for(int si=0;si<=str.length()-len;si++) {
			   int ei=si+len;
			   String s=str.substring(si,ei);//Cb Number
			   
			   //String to int
			   //Integer.parseInt(s); //string to integer
			   //Long.parseLong(s);//String to long
			   
			   if(isCBnumber(Long.parseLong(s))==true && isvisited(visited,si,ei-1)==false) {
				   for(int i=si;i<=ei-1;i++) {
					   visited[i]=true;
				   }
				   count++;
			   }
		   }
	   }
	   return count;
   }
   public static boolean isvisited(boolean[] visited,int si,int ei) {
		for(int k=si;k<=ei;k++) {
			if(visited[k]==true) {
				 return true;
			}
		}
		return false;
	}
   public static boolean isCBnumber(long n) {
	   int  [] arr= {2,3,5,7,11,13,17,19,23,29};
	   // point
	   if(n==0||n==1) {
		   return false;
	   }
	   //point 2
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]==n) {
			   return true;
		   }
	   }
	   //point 3
	   for(int i=0;i<arr.length;i++) {
		   return false;
	   }
   
   return true;
}
}
