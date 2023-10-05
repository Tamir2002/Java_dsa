package Graph_lect_1;

import java.util.*;

public class Bellman_Floyds_Algo {
	private HashMap<Integer,HashMap<Integer,Integer>>map;
	private int e1;
	private int e2;
	private int cost;
	
	public Bellman_Floyds_Algo(int v)
	{
		map=new HashMap<>();
		for (int i =1; i <=v; i++) {
			map.put(i, new HashMap<>());
		}
			
		}
	
	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		
	}
	class EdgePair{
		int e1;
		int e2;
		int cost;
	}
	public void EdgePair(int e1,int e2,int cost) {
		this.e1=e1;
		this.e2=e2;
		this.cost=cost;
	}
public  List<EdgePair>GetAllEdges(){
	List<EdgePair> ll=new ArrayList<>();
	for(int e:map.keySet()) {
		for(int e2:map.get(e1).keySet()) {
			int cost=map.get(e1).get(e2);
			ll.add(new EdgePair(e1,e2,cost));
		}
	}
	return ll;

}

public void Bellman_Floyds_Algo() {
	List<EdgePair> ll=GetAllEdges();
	int v=map.size();
	int [] dis=new int[v+1];
	for(int i=2;i<dis.length;i++) {
		dis[i]=9999999;
	}
	for(EdgePair e:ll) {
		if(dis[e.e2]>dis[e.e1]+e.cost) {
			dis[e.e2]=dis[e.e1]+e.cost;
		}
	}

for(int i=1;i<dis.length;i++){
	System.out.println(dis[i]+" ");
}
}
public static void main(String[] args) {
	Bellman_Floyds_Algo bfd=new Bellman_Floyds_Algo(5);
	bfd.AddEdge(1, 2, 8);
	bfd.AddEdge(2, 5, -2);
	bfd.AddEdge(2, 5, 2);
	bfd.AddEdge(5, 2, 1);
	bfd.AddEdge(4, 5, 4);
	bfd.AddEdge(3, 4, -3);
	bfd.AddEdge(1, 3 ,4);
	bfd.AddEdge(1, 4, 5);
	bfd.Bellman_Floyds_Algo();;
}

}