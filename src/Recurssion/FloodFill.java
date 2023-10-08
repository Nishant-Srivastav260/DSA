package Recurssion;
import java.util.*;
import java.io.*;
public class FloodFill {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rows and columns in array");
	int n=sc.nextInt();
	int m=sc.nextInt();
	int[][] arr=new int[n][m];
	System.out.println("Enter the elements of array either 0 or 1");
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			arr[i][j]=sc.nextInt();
			}
	}
	boolean[][] visited=new boolean[n][m];
	floodf(arr,0,0,"",visited);
	}
  public static void floodf(int maze[][], int row,int col,String ans, boolean visited[][] ) {
	  if(row<0||col<0||row==maze.length||col==maze[0].length||maze[row][col]==1||visited[row][col]==true) {
		  return;
	  }
	  if((row==maze.length-1) && (col==maze[0].length-1)) {
		  System.out.println(ans);
		  return;
	  }
	  visited[row][col]=true;
	  floodf(maze,row-1,col,ans+"t",visited);
	  floodf(maze,row,col-1,ans+"l",visited);
	  floodf(maze,row+1,col,ans+"d",visited);
	  floodf(maze,row,col+1,ans+"r",visited);
	  visited[row][col]=false;
	  
  }
}
