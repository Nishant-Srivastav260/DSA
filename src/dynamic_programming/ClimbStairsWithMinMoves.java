package dynamic_programming;

public class ClimbStairsWithMinMoves {
public static void main(String[] args) {
	
	int n =10;
	int[] a = {3,3,0,2,1,2,4,2,0,0};
	
	Integer[] dp = new Integer[n+1];
	
    dp[n] = 0;
    for(int i =n-1; i>=0; i--) {
    	int min = Integer.MAX_VALUE;
    	if(a[i] > 0) {
    		for(int j =1;j<=a[i] && i+j<=n; j++) {
    			if(dp[i+j]!=null)
    			min = Math.min(min, dp[i+j]);

    		}
    		if(min!= Integer.MAX_VALUE) {
    			dp[i] = min+1;
    		}
    	}
    }
    
    System.out.println(dp[0]);

}
}
