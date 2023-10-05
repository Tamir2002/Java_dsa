package Lecture_20_String_Recursion;

public class KeyPad_Rev {
static String[]key= {"","abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str="12";
       PrintKeyPad(str,"");
	}
	public static void PrintKeyPad(String ques,String ans) {//12
	
		
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
		}
		char ch=ques.charAt(0);// '1'--->49
		String pressString=key[ch-48];// ch->48 
		
		for(int i=0;i<pressString.length();i++) {
			PrintKeyPad(ques.substring(1),ans+pressString.charAt(i));
			
		}
	}

}
