package dynamic_programming;

public class VideoGameDev {
  public static void main(String[] args) {
	int[] a = {1,1,1,1,1,1};
	System.out.println(videoGame(a));
}
  public static int videoGame(int[] a) {
	  
	  int p1s=0, p2s=0;
	  
	  for(int i=0; i<a.length; i++) {
		  if(a[i] == 1) {
			  p2s++;
		  }
		  else {
			  p2s--;
		  }
	  }
	  for(int i=0; i<a.length; i++) {
		  if(p1s > p2s && i==0) {
			  return 0;
		  }
		  else {
			  if(a[i] ==1) {
				  p1s++; p2s--;
			  }
			  else {
				  p1s--; p2s++;
			  }
		  }
		  if(p1s > p2s) {
			  return i+1;
		  }
	  }
	  return a.length;
	  
  }
}
