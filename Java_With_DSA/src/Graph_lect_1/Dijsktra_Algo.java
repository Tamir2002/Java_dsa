package Graph_lect_1;
import java.util.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

import Graph_lect_1.Prims_Algo.PrimsPair;

public class Dijsktra_Algo {
	private HashMap<Integer, HashMap<Integer, Integer>> map;

	public Dijsktra_Algo(int v) {
		// TODO Auto-generated constructor stub
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	public void DijsktraAlgo(){
		PriorityQueue<DijsktraPair> pq=new PriorityQueue<>(new Comparator<DijsktraPair>() {
		
		@Override
		public int compare(DijsktraPair o1,DijsktraPair o2) {
			return o1.cost-o2.cost;
		   }
		});
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new DijsktraPair(1,1,0));
		while(!pq.isEmpty()) {
			// 1. remove
			DijsktraPair pq=pd.poll();
			
			// 2. Ignore if Already visited
			if(visited.contains(dp.vtx)) {
				continue;
			}
			// visited 
			visited.add(dp.vtx);
			// 4 self work
			System.out.println(dp);
			// 5 Add nbrs
			for(int nbrs:map.get(dp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost=map.get(dp.vtx).get(nbrs);
					pd.add(new DijsktraPair(nbrs,dp.vtx,cost));
				}
			}
			
		}	
	}
	class PrimsPair{
		int vtx;
		int acq;
		int cost;
  public PrimsPair(int vtx,int acq,int cost) {
			this.vtx=vtx;
			this.acq=acq;
			this.cost=cost;
		}
  public String toString() {
	  return this.vtx+" "+this.acq+" @ "+this.cost;
  }
	}
	
	
}
