package Lecture_16_String;

public class Sub_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s="hello";
    PrintAllSubString(s);
	}
	public static void PrintAllSubString(String s) {
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				System.out.println(s.substring(i,j));
			}
			
		}
	}

}
