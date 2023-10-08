package dynamic_programming;

import java.util.*;
public class TargetSum {
	
   public static void main(String[] args) {
	   int[] a= {4,3,5,64,5,8};
	   int target = 10;
	   
	   boolean[][] dp = new boolean[a.length +1][target+1];
	   
	   for(int i=0; i< dp.length; i++) {
		   for(int j =0; j < dp[0].length; j++) {
			   
			   if(i ==0 && j==0) {
				   dp[i][j]= true;

			   }
			   else if(i ==0) {
				   dp[i][j] =false;
			   }
			   else if(j==0) {
				   
				   dp[i][j] = true;
			   }
			   else {
				   if(a[i-1] > j) {
					   if(dp[i-1][j] == true) {
						   dp[i][j] = true;
					   }
					   else {
						   dp[i][j] = false;
					   }
				   }
				   else if(a[i-1] <=j) {
					   int sub = j - a[i-1];
					   if(dp[i-1][sub] == true) {
						   dp[i][j] = true;
					   }
					   else {
						   dp[i][j]= false;
					   }
				   }
			   }
		   }
	   }
	   System.out.println(dp[a.length][target]);
	   
	
}
}
