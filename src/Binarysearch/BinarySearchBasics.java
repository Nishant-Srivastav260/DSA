
package Binarysearch;
import java.util.*;
public class BinarySearchBasics {
	
	public static void main(String[] args) {
		
		int[] a = {1,3,5,8,45,67};
		int index = binarySearchIndex(a, 45);
	    System.out.println(index);
	    int[] b = {67,45,8,5,3,1};
	    System.out.println(binarySearchReverseIndex(b, 45));
		
	   
	}
	
	// Array is Sorted in ascending order
	public static int binarySearchIndex(int[] a, int num) {
		int start =0, end = a.length -1;
		int mid =0;
		
		while(start<=end) {
			mid = start+ (end-start)/2;
			
			if(a[mid] == num) {
				return mid;
			}
			else if(num> a[mid]) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}
	//Array Sorted in descending order
	public static int binarySearchReverseIndex(int[] a, int num) {
		int start =0, end = a.length -1;
		int mid =0;
		
		while(start<=end) {
			mid = start+ (end-start)/2;
			
			if(a[mid] == num) {
				return mid;
			}
			else if(num< a[mid]) {
				start = mid+1;
			}
			else {
				end = mid -1;
			}
		}
		return -1;
	}

}
