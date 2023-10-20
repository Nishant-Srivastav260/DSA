package graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AirportDestination {
	
	static class Edge{
		int src;
		int nbr;
		int wt;
		
	public Edge(int src,  int nbr, int wt) {
		this.src = src;
		this.nbr = nbr;
		this.wt = wt;
	}
	}
	
	static class Travel{
		int src;
		int dest;
		public Travel(int src, int dest) {
			super();
			this.src = src;
			this.dest = dest;
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String nmkq = br.readLine();
		String[] parts = nmkq.split(" ");
		int n = Integer.parseInt(parts[0]);
		int m = Integer.parseInt(parts[1]);
		int k = Integer.parseInt(parts[2]);
		int q = Integer.parseInt(parts[3]);
		int size = m+1;
		ArrayList<Edge>[] graphs = new ArrayList[size];
		for(int i =0; i< m+1;i++) {
			graphs[i] = new ArrayList<Edge>() ;
		}
		
		for(int i =0; i< m; i++) {
			String s = br.readLine();
			String[] sparts = s.split(" ");
			int v1 = Integer.parseInt(sparts[0]);
			
			int v2 = Integer.parseInt(sparts[1]);
			int wt = Integer.parseInt(sparts[2]);
			graphs[v1].add(new Edge(v1, v2, wt));
			
			
		}
		ArrayList<Travel> travel = new ArrayList<>();
		boolean[] visited = new boolean[m+1];
		for(int i =0; i< q; i++) {
			String s = br.readLine();
			String[] sparts = s.split(" ");
			int v1 = Integer.parseInt(sparts[0]);
			int v2 = Integer.parseInt(sparts[1]);
			
			travel.add(new Travel(v1, v2));
	
		}
		int routes =0; int cost =0;
		for(Travel t: travel) {
			int amount =0;
			 amount = weight(graphs, t.src, t.dest, amount, visited);
			if(amount> 0) {
				routes++;
				cost+=amount;
			}
		}
		
		System.out.println(routes +"  "+ cost);
		}
		
	public static int weight(ArrayList<Edge>[] graphs, int src, int dest, int wsf, boolean[] visited) {
	 if(src == dest) {
		 return wsf;
	 }
	 visited[src] = true;
	 for(Edge edge: graphs[src]) {
		 if(visited[edge.nbr] == false) {
			 int wt = weight(graphs, edge.nbr, dest, wsf+edge.wt, visited);
			 if(wt>0) {
				 return wt; 
			 }
			
		 }
	 }
	 visited[src] = false;
	 return 0;	
	}

}
/*
  Sample Input
3 3 1 3
3 1 10
1 3 10
1 2 7
3 2
2 3
1 2
*/