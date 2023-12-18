package Binarysearch;
//Searching in Nearly sorted array
public class SerchingInNearlySortedArray {

	public static void main(String[] args) {
		 int[] a = {1,5,4,12,7,24,56,60 };
		 System.out.println(nearlySortedArray(a, 1));
	}
	public static int nearlySortedArray(int[] a , int num) {
		int n = a.length;
		int start =0, end = n-1, mid =0;
		
		while(start<=end) {
			mid = start + (end-start)/2;
			if(num==a[mid]) {
				return mid;
			}
			else if(mid-1>= start && num==a[mid-1]) {
				return mid-1;
			}
			else if(mid+1<= end && num==a[mid+1]) {
				return mid+1;
			}
			else if(mid-1>= start && num < a[mid-1]) {
				end = mid-2;
			}
			else if(mid+1<= end && num >a[mid+1]) {
				start = start+ 2;
			}
		}
		return mid;
	}

}
