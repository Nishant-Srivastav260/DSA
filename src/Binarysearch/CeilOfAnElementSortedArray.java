package Binarysearch;

public class CeilOfAnElementSortedArray {
   public static void main(String[] args) {
	int[] a = {2,4,7,7,12,15,45,45,60};
	System.out.println(ceilOfElement(a, -1));
	
}
   public static int ceilOfElement(int[] a, int num) {
	   int n = a.length;
	   int start =0, end = n-1, mid =0;
	   
	  while(start<=end) {
		  mid= start + (end-start)/2;
		  
		  if(a[mid] == num) {
			  return a[mid];
		  }
		  else if(mid+1<end && a[mid]< num && a[mid+1]>num) {
			  return a[mid+1];
		  }
		  else if(num<a[start]) {
			  return a[start];
		  }
		  else if(num<a[mid]) {
			  end = mid-1;
		  }
		  else if(num>a[mid]) {
			  start = start+1;
		  }
	  }
	  return -1;
	  
   }
}
