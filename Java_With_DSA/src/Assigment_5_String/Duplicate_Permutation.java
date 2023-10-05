package Assigment_5_String;

public class Duplicate_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abca";
		printPermutation(str,"");

	}
	public static void printPermutation(String ques,String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<ques.length();i++) {
			String ros=ques.substring(0,i)+ques.substring(i+1);
			char ch=ques.charAt(i);
			boolean flag=true;
			for(int j=i+1;j<ques.length();j++) {
				if(ques.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			//flag false
			if(flag==true) {
		printPermutation(ros,ans+ch);
		}
		}
	}

}
