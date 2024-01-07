package dynamic_programming;

public class Fibonacci {
  public static void main(String[] args) {
	  int[] qb = new int[5];
	System.out.println(fiboMemo(4, qb));
}
  // Recursive solution
  public static int fibo(int n) {
	  System.out.println(n);
	  if(n==0 || n==1) {
		  return n;
	  }
	  System.out.println(n);
	  int ans = fibo(n-1) + fibo(n-2);
	  return ans;
  }
  //Memoization solution
   public static int fiboMemo(int n, int[] qb) {
	   
	   if(n==0 || n==1) {
		   return n;
	   }
	   if(qb[n]!=0) {
		   return n;
	   }
	   System.out.println(n);
	   int ans = fiboMemo(n-1, qb) + fiboMemo(n-2, qb);
	    
	   qb[n] = ans;
	   
	   return ans;
   }
}
