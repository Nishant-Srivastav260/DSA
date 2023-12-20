package Binarysearch;
//Floor and Ceil of an element in a sorted array
public class FloorOfAnElementSortedArray {
 public static void main(String[] args) {
	 int[] a = {1,3,5,8,45,67};
	 System.out.println(floorInSortedArray(a, 2.9));
	 
}
 public static int floorInSortedArray(int[] a , double num) {
	 int n = a.length;
	 int start =0, end = n-1, mid =0;
	 
	 while(start<=end) {
		 
		 mid = start + (end-start)/2;
		 if(num == a[mid]) {
			 return a[mid];
			 }
		 else if(mid+1 <= end && a[mid] < num && a[mid+1] > num) {
			 return a[mid];
			 // For Ceil of an element 
			 // return a[mid+1];
		 }
		 else if(num>a[end]) {
			 return a[end];
		 }
		 else if(num > a[mid] ) {
			 start = mid+1;
		 }
		 else if(num < a[mid]) {
			 end = mid -1;
		 }
	 }
	 return -1;
	 
 }
}
