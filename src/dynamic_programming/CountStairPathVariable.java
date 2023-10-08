package dynamic_programming;
import java.util.*;
import java.io.*;
public class CountStairPathVariable {
public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no. of stairs");
	int n=sc.nextInt();
	int[] e =new int[n+1];
	System.out.println("Enter the no. of elements corresponding to stair");
	for(int i=0;i<n+1;i++) {
		System.out.println("stair "+i);
		e[i]=sc.nextInt();
		}
	System.out.println("no. of paths= "+countstair(n,e));
	
	}
public static int countstair(int n, int[] e) {
	int[]dp=new int[n+1];
	dp[0]=1;
	for(int i=1;i<n+1;i++) {
		int temp=e[i];
		dp[i]=0;
	for(int j=0;j<=temp&&(i-j>=0);j++) {
		
		dp[i]=dp[i]+dp[i-j];
		
	}
	}
	return dp[n];
}
}
