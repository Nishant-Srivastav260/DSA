package dynamic_programming;

public class StonesPartition {
	public static void main(String[] args) {
		int[] a = {1,5,3,4,3};
		int[] b = {0,2,1,5,0};
		int[] stones = {1,1,1,1,1};
		
		System.out.println(minCost(0, 4, a, b, stones));
		
		
}
	static int[][] dp = new int[6][6];
	public static int minCost(int i, int j, int[] a, int[] b, int[]  stones) {
		
		if(i>=j) {
			return 0;
		}
		if(dp[i][j]!=0) {
			return dp[i][j];
		}
		int mini = Integer.MAX_VALUE;
		for(int ind =i; ind<=j; ind++) {
			stones[ind] =0;
			int cost =0;
			
		
			if(ind ==0) {
				if(stones[ind+1]==0) {
					cost = 0+ minCost(ind+1,j,a,b,stones);
				}
				else {
					cost = a[ind] + minCost(ind+1,j,a,b,stones);
				}
			}
			else if(ind == stones.length -1) {
				if(stones[ind-1]==0) {
					cost = 0 + minCost(i,ind-1,a,b,stones);
				}
				else {
					cost = a[ind] + minCost(i,ind-1,a,b,stones);
				}
			}
			else if(stones[ind-1] == 0 && stones[ind+1]==0) {
				cost = 0 + minCost(i,ind-1,a,b,stones) + minCost(ind+1,j,a,b,stones);
			}
			else if(stones[ind-1] == 1 && stones[ind+1]==1 ) {
				cost = b[ind] + minCost(i,ind-1,a,b,stones)+ minCost(ind+1,j,a,b,stones);
			}
			else if(stones[ind-1] ==0 || stones[ind+1]==0) {
				cost = a[ind] + minCost(i,ind-1,a,b,stones)+ minCost(ind+1,j,a,b,stones);
			}
			mini = Math.min(mini, cost);
			stones[ind] =1;
		}
		System.out.println("i = "+ i + ", j = "+ j + " , mini = "+ mini);
		dp[i][j] = mini;
		return dp[i][j];
	}


}
