package Binarysearch;
// How many times is a sorted array rotated
public class NumberOfTimesArrayIsRotated {
  public static void main(String[] args) {
	int[] a = {9,10,11,12,15,18,2,2,2,6,6,7,8};
	System.out.println(rotated(a));
}
  public static int rotated(int[] a){
	  int start =0, end = a.length -1, mid =0;
	  int count =0; int next =0, prev = 0;
	  if(a[end] > a[start]) {
		  return 0;
	  }
	  
	  while(start<=end) {
		  mid = start + (end-start)/2;
		  //Check for smallest element
		  next = (mid+1)%a.length;
		  prev = (mid-1+a.length) % a.length;
		  if(prev > a[mid] && a[mid]<= next) {
			  break;
		  }
		  //Check for moving to right half of the array
		  if(a[mid] > a[end] ) {
			  start = mid +1;
		  }
		  else {
			  //Check for moving to left half of the array
			  end = mid -1;
		  }
		 
	  }
	  count = a.length - mid;
	  return count;
	  
  }
  
}
