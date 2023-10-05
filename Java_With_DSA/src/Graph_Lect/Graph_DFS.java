package Graph_Lect;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph_DFS {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph_DFS(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}
	
	public boolean DFS(int src,int des) {
		Stack<Integer>s=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		s.push(src);
		while(!s.isEmpty()) {
			//1.remove
			int  rv=s.pop();
			// 2 .Ignore if Already Visited
			if(visited.contains(rv)) {
				continue;
			}
			// 3.marked visited
			visited.add(rv);
			if(rv==des) {
				return true;
			}
			// 5.Add nbrs
			 for(int nbrs:map.get(rv).keySet()) {
				if(!visited.contains(nbrs)) {
					s.add(nbrs);
				}
			}
			
		}
		return false;
	}
	
}