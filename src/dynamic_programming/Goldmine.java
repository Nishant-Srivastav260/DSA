package dynamic_programming;
//https://www.pepcoding.com/resources/online-java-foundation/dynamic-programming-and-greedy/goldmine-official/ojquestion
import java.util.*;
public class Goldmine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int row = sc.nextInt();
		int column = sc.nextInt();
		int[][] a = new int[row][column];
		for(int i = 0; i< row; i++) {
			for(int j=0; j<column; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		int[][] dp =new int[row][column];
		
		
		// Solve the column = column values
		for(int i = row -1; i>=0;i--) {
			dp[i][column-1] = a[i][column-1]; 
		}
		
		for(int i = column -2; i>=0; i--) {
			for(int j = row-1; j>= 0; j--) {
				if(j == row-1) {
					dp[i][j] = Math.max(dp[j-1][i+1],dp[j][i+1]) + a[i][j];
				}
				else if(j== 0) {
					dp[i][j] = Math.max(dp[j+1][i+1],dp[j][i+1])+ a[i][j];
					
				}
				else {
					dp[i][j] = Math.max(dp[j+1][i+1],Math.max(dp[j][i+1],dp[j-1][i+1]))+ a[i][j];
				}
			}
			
		}
		System.out.println(dp[0][0]);
		
	}
}
