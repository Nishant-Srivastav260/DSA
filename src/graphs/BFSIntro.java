package graphs;
import java.io.*;
import java.util.*;

public class BFSIntro {
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   static class Pair{
	   int vertex;
	   String pathSoFar; // path from the source
	   
	public Pair(int vertex, String pathSoFar) {
		super();
		this.vertex = vertex;
		this.pathSoFar = pathSoFar;
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
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());
      
      // BFS algorithm starts here
      boolean[] visited = new boolean[vtces];
      Queue<Pair> q = new ArrayDeque<>();
      q.add(new Pair(src, src+""));
      
      
      while(q.size() > 0) {
    	  // Step 1 : Remove
    	  Pair removed = q.remove();
    	  //Step 2: Mark
    	  if(visited[removed.vertex] == false) {
    		  visited[removed.vertex] = true; 
    	  }
    	  else {
    		  continue;
    	  }
    	  //Step 3: Work
    	  System.out.println(removed.vertex +" @ "+ removed.pathSoFar );
    	  
    	  //Step 4: add
    	  for(Edge e : graph[removed.vertex]) {
    		  if(visited[e.nbr] == false) {
    			  q.add(new Pair(e.nbr, removed.pathSoFar + e.nbr));
    		  }
    	  }
      }
 
   }
}
