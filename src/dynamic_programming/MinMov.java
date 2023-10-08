package dynamic_programming;
import java.io.*;
import java.util.*;
public class MinMov {
	
 public static void main(String[] args) throws Exception {
	      
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter no.");
	        int n=sc.nextInt();
	        int[] arr= new int[n];
	        for(int i=0;i<n;i++){
	            arr[i]=sc.nextInt();
	        }
	        
	        int[] dp=new int[n+1];
	        dp[n]=1;int count=0;
	        for(int i=1;i<=arr[0];i++){
	            
	            for(int j=n-1;j>=i;j--){
	                if(arr[j]>0){
	                    for(int z=1;z<=arr[j]&&z+j<dp.length;z++){
	                        dp[j]+=dp[z+j];
	                    }
	                }
	            }
	          System.out.println(dp[i]);  
	        if(i==1)
	        count=dp[i];
	        else if(i>1&& dp[i]<count)
	        count=dp[i];
	        else continue;
	            
	        }
	        System.out.println(count+1);
	     }

	}

