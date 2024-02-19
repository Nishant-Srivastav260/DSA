package dynamic_programming;
import java.util.*;
public class CountEncodings {
	public static void main(String[] args) {
		int[] a = {2,3,1,0,1,1};
		int l = a.length;
		int[] dp = new int[l];
		dp[0] = 1;
		
		for(int i = 1; i<a.length; i++) {
			
			// Case 1: single element
			if(a[i]!=0) {
				dp[i] = dp[i] + dp[i-1];
			}
			//Case 2: Double Element
			int num = a[i-1]*10 + a[i];
			if(num <= 26 && i>1 && a[i-1]!=0) {
				dp[i] = dp[i] + dp[i-2];
			}
			else if(num <= 26 && i==1 && a[i-1]!=0) {
				dp[i] = dp[i]+1;
			}
		}
		System.out.println(dp[l-1]);
	}	

}
