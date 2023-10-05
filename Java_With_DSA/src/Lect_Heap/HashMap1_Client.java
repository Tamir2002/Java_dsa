package Lect_Heap;

public class HashMap1_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap1<String,Integer>map=new HashMap1<>();
		
		map.put("Riya", 87);
		map.put("Nitesh", 85);
		map.put("Ankit", 90);
		map.put("Alam", 88);
		map.put("Tamir", 92);
		map.put("Abhi", 80);
		System.out.println(map);
		map.put("Tamir", 8);
		System.out.println(map);
		System.out.println(map.get("siddique"));
		System.out.println(map.get("Alam"));
		System.out.println(map.containsKey("Alam"));
		System.out.println(map.remove("Ankit"));
		System.out.println(map);

	}

}
