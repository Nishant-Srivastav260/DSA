package dynamic_programming;

import java.util.*;
public class CoinChangeCombinations {
   public static void main(String[] args) {
	 int[] a = {2,3,5,6,4};
	 int target = 7;
	 
	 int[] dp = new int[target+1];
	 dp[0] =1;
	 
	 for(int i = 0;i< a.length; i++) {
		 for(int j= a[i]; j< dp.length; j++) {
			dp[j]+= dp[j-a[i]]; 
		 }
	 }
	 System.out.println(dp[target]);
	   
}
}