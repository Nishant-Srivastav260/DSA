package Binarysearch;

public class  BinarySearchOrderAgnostic {
    public static void main(String[] args) {
    	int[] a = {1,3,5,8,45,67};
		int index = binarySearchIndex(a, 45);
		System.out.println(index);
		 int[] b = {67,45,8,5,3,1};
		 System.out.println(binarySearchIndex(b, 45));
	}
    public static int binarySearchIndex(int[] a , int num) {
    	
    	int start =0, end = a.length -1;
    	int mid =0; int diff =0;
    	if(a.length == 1) {
    		if(a[0] == num) {
    			return 0;
    		}
    	}
    	else {
    		diff = a[a.length-1] - a[0]; // if diff > 0 then array is in ascending order
    		if(diff == 0) {
    			return -1;
    		}
    	}
    	if(diff > 0) {
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
		}}
    	
    	else {
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
    }
    	return -1;}
}
