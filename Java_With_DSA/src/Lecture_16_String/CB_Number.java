package Lecture_16_String;

public class CB_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="81615";
	}
	public static int Count(String s) {
		int count=0;
		boolean [] visited=new boolean[s.length()];
		for(int len=1;len<s.length();len++) {
			for(int j=len;j<=s.length();j++) {
				
				int i=j-len;
				String s1=s.substring(i,j);
				//System.out.println(s.substring(i,j));
				// Integer.parseInt(s1)--> string ko number me gnerate karega(int)
				// long .parseLong(s1)--> string ko number me generate long me kargea(long)
				long num=Long.parseLong(s1);
				if(isCbNumber(num)==true && isvisited(visited,i,j)==true) {
					count++;
					for(int k=i;k<j;k++) {
						visited[k]=true;
					}
				}
			}
		}
		return count;
	}
public static boolean isvisited(boolean[] visited,int i,int j) {
	for(int k=i;k<j;k++) {
		if(visited[k]==true) {
			 return false;
		}
	}
	return true;
}

	public static boolean isCbNumber(long num) {
		if(num==0||num==1) {
			return false;
		}
		int [] arr= {2,3,4,5,7,11,13,17,19,23,29};
		// 2
		for(int i=0;i<arr.length;i++) {
		if(num==arr[i]) {
			return true;
		}
		}
		// 3
		for(int i=0;i<arr.length;i++) {
			if(num%arr[i]==0) {
				return false;
			}
		}
		return true;
	}

}
