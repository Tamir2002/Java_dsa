package Lecture_27_Recursion_Assignment_6;

public class Remove_Duplicate_Letters {

	public static void main(String[] args) {
		 char s[] = "bcabc".toCharArray();
	        int n = s.length;
	        removeDuplicates(s, n);
	}
		// TODO Auto-generated method stub

		  public static void removeDuplicates(char s[], int n)
		    {
		        String ans="";
		        int i,j;
		        for(i=0;i<n;i++){
		            for(j=0;j<i;j++){
		                if(s[i]==s[j]){
		                    break;     // We are breaking here because this caharacter is already
		                }              // added to our answer because it was found earlier
		                               
		            }
		            if(j==i){          // The loop ends without breaking, it means this 
		                ans+=s[i];     // is the first occurence of this character in the string 
		            }                  // so we add this character to our answer
		        }
		        System.out.print(ans);
		    }
		  
		}