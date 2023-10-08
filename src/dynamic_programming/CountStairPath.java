package dynamic_programming;
import java.util.*;
public class CountStairPath {
public static void main(String[] args ) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	countstair(n);
	
}
public static void countstair(int n) {
	int[] dp=new int[n+1];
	dp[n]=1;
	for(int i=n-1;i>=0;i--) {
		dp[i]=0;
		for(int j=1;(j<=3)&&(i+j<=n);j++) {
			dp[i]=dp[i]+dp[i+j];
		}
	
	}
System.out.println(dp[0]);
	
}
}
