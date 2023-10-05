package Map_Demo_and_Qps;
import java.util.*;
public class Leetcode_Group_Angram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] strs= {"eat","tea","ate","nat","bat"};
		System.out.println(Angrams(strs));
		

	}
	public static  List<List<String>>Angrams(String [] strs){
		
		HashMap<String,List<String>> map=new HashMap<>();
		for (int i = 0; i < strs.length; i++) {
			String s=strs[i];
			String key=GenerateKey(s);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}
			map.get(key).add(s);
			
		}
		List<List<String>> ans=new ArrayList<>();
		for(String key:map.keySet()) {
			ans.add(map.get(key));
		}
		return ans;
 	}
	public static String GenerateKey(String s) {
		
		int [] freq=new int [26];
		for (int i = 0; i < s.length(); i++) {
			char ch=s.charAt(i);
			freq[ch-'a']=freq[ch-'a']+1;
			
		}
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < freq.length; i++) {
			sb.append(freq[i]+" ");
			
		}
		return sb.toString();
	}

}
