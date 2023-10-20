package graphs;

import java.io.*;
import java.util.*;

public class HamiltonianPathCycle {
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      int src = Integer.parseInt(br.readLine());

      // write all your codes here
      HashSet<Integer> visited = new HashSet<>();
      hamiltonian(graph, src, src+"", visited, src);
      
   }

   public static void hamiltonian(ArrayList<Edge>[] graph, int src, String psf, HashSet<Integer> visited, int originalSource) {
	   if(visited.size() == graph.length -1) {
		   System.out.print(psf);
		   boolean cycle = false;
	   for(Edge e : graph[src]) {
		   if(e.nbr == originalSource) {
			   cycle = true;
			   System.out.println("*");
		   }
	   }
	   if(cycle == false) {
		   System.out.println(".");
	   }}
	   
	   visited.add(src);
	   
	   for(Edge e : graph[src]) {
		   if(visited.contains(e.nbr) == false) {
			   hamiltonian(graph, e.nbr, psf + e.nbr, visited, originalSource);
		   }
	   }
	   visited.remove(src);
	   
   }
}
/*
 7
9
0 1 10
1 2 10
2 3 10
0 3 10
3 4 10
4 5 10
5 6 10
4 6 10
2 5 10
0
 */


