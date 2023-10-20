package graphs;

import java.io.*;
import java.util.*;

public class NumberOfIslands {
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int m = Integer.parseInt(br.readLine());
      int n = Integer.parseInt(br.readLine());
      int[][] arr = new int[m][n];

      for (int i = 0; i < arr.length; i++) {
         String parts = br.readLine();
         for (int j = 0; j < arr[0].length; j++) {
            arr[i][j] = Integer.parseInt(parts.split(" ")[j]);
         }
      }

      // write your code here
      int count =0; // count number of islands
      boolean[][] visited = new boolean[arr.length][arr[0].length];
      //go through all vertices only those which are land and not visited
      for(int r =0; r < arr.length; r++) {
    	  for(int c =0; c < arr[0].length; c++) {
    		  if(arr[r][c] ==0 && visited[r][c] ==false) {
    			  numberOfIslands(arr, r, c, visited);
        		  count++;  
    		  }
    		  
    	  }
      }
      System.out.println(count);
   }
   
   public static void numberOfIslands(int[][] arr, int r, int c, boolean[][] visited ) {
	   if(r<0 || c<0 || r>= arr.length || c>= arr[0].length || arr[r][c]==1 || visited[r][c] == true ) {
		   return;
	   }
	   
	   visited[r][c] = true;
	   numberOfIslands(arr, r+1, c, visited);  // down
	   numberOfIslands(arr, r, c+1, visited);  //right
	   numberOfIslands(arr, r-1, c, visited); //Up
	   numberOfIslands(arr, r, c-1, visited); // left
	   
   }

}
// Sample input
//8
//8
//0 0 1 1 1 1 1 1
//0 0 1 1 1 1 1 1
//1 1 1 1 1 1 1 0
//1 1 0 0 0 1 1 0
//1 1 1 1 0 1 1 0
//1 1 1 1 0 1 1 0
//1 1 1 1 1 1 1 0
//1 1 1 1 1 1 1 0
