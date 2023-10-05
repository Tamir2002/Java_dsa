package Map_Demo_and_Qps;
import java.util.*;

public class HashMap_Demo {
public static void main(String[] args) {
HashMap<String,Integer> map=new HashMap<>();
	
	//add
map.put("alam",89);
map.put("siddique",90);
map.put("mister", 85);
map.put("sanjeev",93);
map.put(null,89);
//System.out.println(map);

// way1


Set<String>key=map.keySet();
System.out.println(key);

for(String k:key) {
	System.out.println(k+" "+map.get(key));
}


// way 2

for(String k:map.keySet()) {
	System.out.println(k+" "+map.get(k));
}
System.out.println("*************************");
ArrayList<String> ll=new ArrayList<>(map.keySet());
for(int i=0;i<ll.size();i++) {
	System.out.println(ll.get(i));
}














// get
//o(1)

//System.out.println(map.get("Raj"));
//System.out.println(map.get("alam"));	


//containsKey o(1)

//System.out.println(map.containsKey("virat"));
//System.out.println(map.containsKey("mister"));


// remove

//System.out.println(map);
//System.out.println(map.remove("rohit"));
//System.out.println(map.remove("mister"));
//System.out.println(map);

TreeMap<String,Integer> map1=new TreeMap<>();
//add
//log(N)


//map1.put("alam",89);
//map1.put("siddique",90);
//map1.put("mister", 85);
//map1.put("sanjeev",93);
////map1.put(null,89); // null nhi chalge due to key as sorted hota hai aur   comapreTo   use huwa hoga 
//System.out.println(map1);



//LinkedHashMap<String,Integer> map2=new LinkedHashMap<>();

//add
//o(1)
//map2.put("alam",89);
//map2.put("siddique",90);
//map2.put("mister", 85);
//map2.put("sanjeev",93);
//map2.put(null,45);
//System.out.println(map2);// insertion preserve hota hai


   }
}
