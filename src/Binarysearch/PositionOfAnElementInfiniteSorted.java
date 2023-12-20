package Binarysearch;

public class PositionOfAnElementInfiniteSorted {
 public static void main(String[] args) {
	int[] a= {1,3,5,6,7,8,9,12,14,15,16,17,18};
	System.out.println(postionOfElement(a, 17));
	
}
 public static int postionOfElement(int[] a, int num){
	 int start =0, end =1, mid=0;
	 
	 while(start<=end) {
		 
		 // Supposed to be an infinite array so we will get an exception 
		 // if the input array is finite
		 if(num> a[end]) {
			 start =end;
			 end = end*2;
		 }
		 else {
			 mid=start+(end-start)/2;
			 if(num==a[mid]) {
				 return mid;
			 }
			 else if(num>a[mid]) {
				start = mid+1; 
			 }
			 else {
				 end = mid -1;
			 }
		 }
	 }
	 return -1;
 }
}
