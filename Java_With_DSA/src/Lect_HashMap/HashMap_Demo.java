package Lect_HashMap;
import java.util.HashMap;

import java.util.*;
public class HashMap_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map=new HashMap<>();
		
		map.put("Tamir", 80);
		map.put("Alam", 79);
		map.put("Ankit", 82);
		map.put("Suraj", 90);
		map.put("Abhi", 85);
		map.put("Mister",75);
		//map.put(null, 77);
		//System.out.println(map);
		
		Set<String> key=map.keySet();
		for(String k:key) {
			System.out.println(k+" "+map.get(k));
		}
//		
//		// remove
//		System.out.println(map.remove("sarfraz"));
//		System.out.println(map);
//		
//		// key present hai ki nhi
//		
//		System.out.println(map.containsKey("Ankit"));
//		System.out.println(map.containsKey("Hello"));
//		
//		// get
//		System.out.println(map.get("Ankit"));
//		System.out.println(map.get("Sharma"));
		
		
		
  TreeMap<String,Integer> map1=new TreeMap<>();
		
		map1.put("Tamir", 80);
		map1.put("Alam", 79);
		map1.put("Ankit", 82);
		map1.put("Suraj", 90);
		map1.put("Abhi", 85);
		map1.put("Mister",75);
		//map.put(null, 77);
		//System.out.println(map1);
		
  LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();
			map2.put("Tamir", 80);
			map2.put("Alam", 79);
			map2.put("Ankit", 82);
			map2.put("Suraj", 90);
			map2.put("Abhi", 85);
			map2.put("Mister",75);
			//map.put(null, 77);
			//System.out.println(map2);
			
		
		
		

	}

}
