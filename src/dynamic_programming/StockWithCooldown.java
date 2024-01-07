package dynamic_programming;

public class StockWithCooldown {
  public static void main(String[] args) {
	  int[] a = {10,15,17,20,16,18,22,20};
	  int bsp = -a[0], ssp = 0, csp = 0;
	  int obsp , ossp, ocsp;  // for storing previous state profits
	  
	  for(int i=0;i<a.length; i++) {
		  obsp = bsp;
		  ossp = ssp;
		  ocsp = csp;
		  
		  // bsp condition
		  if((ocsp - a[i]) > obsp) {
			  bsp = ocsp - a[i];
		  }
		  //ssp condition
		  if((a[i] + obsp)> ossp) {
			  ssp = a[i] + obsp;
		  }
		  //csp condition
		  if(ossp > ocsp) {
			  csp = ossp;
		  }
		  
	  }
	  System.out.println(ssp);
}
}
