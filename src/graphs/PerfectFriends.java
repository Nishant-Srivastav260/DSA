package graphs;

import java.io.*;
import java.util.*;

public class PerfectFriends {
	static class Edge{
		int src;
		int nbr;
		public Edge(int src, int nbr) {
			super();
			this.src = src;
			this.nbr = nbr;
		}
	}
   

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());
      int k = Integer.parseInt(br.readLine());
      
      ArrayList<Edge>[] graphs = new ArrayList[n];
      for(int i =0; i< n; i++) {
    	  graphs[i] = new ArrayList<Edge>();
      }
      
      //Store Values in graph
      for(int i =0; i< k;i++) {
    	  String line = br.readLine();
    	  String[] parts = line.split(" ");
    	  int v1 = Integer.parseInt(parts[0]);
    	  int v2 = Integer.parseInt(parts[1]);
    	  graphs[v1].add(new Edge(v1, v2));
    	  graphs[v2].add(new Edge(v2, v1));
       }
      
      ArrayList<ArrayList<Integer>>  comps =new ArrayList<>();
      boolean[] visited =new boolean[n];
      
      for(int i=0 ; i< n; i++) {
    	  if(visited[i] == false) {
    		  ArrayList<Integer> comp = new ArrayList<>();
    		  comp.add(i);
    		  generateFriendsTree(graphs, i, comp, visited);
    		  comps.add(comp);
    	  }
      }
      int pairs =0;
      for(int i =0; i< comps.size() -1 ; i++) {
    	  for(int j = i+1; j<comps.size(); j++) {
    		  int count = comps.get(i).size() * comps.get(j).size();
    		  pairs += count;
    	  }
      }
      
      System.out.println(pairs);
      
     
      
      
      // write your code here
   }
   
    public static void generateFriendsTree(ArrayList<Edge>[] graphs, int src,ArrayList<Integer> comp, boolean[] visited ) {
    	
    	visited[src] = true;
    	for(Edge edge: graphs[src]) {
    		if(visited[edge.nbr] == false) {
    			comp.add(edge.nbr);
    			generateFriendsTree(graphs, edge.nbr, comp, visited);
    		}
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }

}