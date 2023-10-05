package Graph_lect_1;
import java.util.*;
public class isBipartile_graph {
	class Solution {
	    public boolean isBipartite(int[][] graph) {
	    	HashMap<Integer,Integer> visited=new HashMap<>();
	    	Queue<Bipartite> q=new LinkedList<>();
	    	for (int i = 0; i < graph.length; i++) {
	    		if(visited.containsKey(i)) {
	    			continue;
	    		}
	    		q.add(new Bipartite(i,0));
	    		while(!q.isEmpty()) {
	    			// 1. remove
	    			Bipartite rp=q.remove();
	    			//  2 Ignore if Already visited
	    			if(visited.containsKey(rp.vtx)) {
	    				if(visited.get(rp.vtx)!=rp.dis) {
	    					return false;
	    				}
	    				continue;
	    			}
	    			// 3 visited
	    			visited.put(rp.vtx,rp.dis);
	    			// 4 steps need nhi hai
	    			
	    			// 5 Add nbrs
	    			for(int nbrs:graph[rp.vtx]) {
	    				if(!visited.containsKey(nbrs)) {
	    					q.add(new Bipartite(nbrs,rp.dis+1));
	    				}
	    			}
	    				
	    			
	    		}
				
			}
	    	return true;
	    	
	        
	    }
	}
	class Bipartite{
		int vtx;
		int dis;
		public Bipartite(int vtx,int dis) {
			this.vtx=vtx;
			this.dis=dis;
		}
	}

}
