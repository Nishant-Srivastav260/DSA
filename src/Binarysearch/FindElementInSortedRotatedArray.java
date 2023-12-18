package Binarysearch;

public class FindElementInSortedRotatedArray {
public static void main(String[] args) {
	int[] a = {8,9,10,11,12,15,18,2,2,2,6,6,7,8};
	System.out.println(elementinSortedRotatedArray(a, 6));
}
public static int elementinSortedRotatedArray(int[] a , int num) {
	int l =a.length;
	int start =0, end = l-1, mid =0;
	
	while(start<=end) {
		mid = start +(end-start)/2;
		int next = (mid+1)%l, prev = (mid-1+l)%l;
		
		if(a[prev] > a[mid] && a[next]>=a[mid]) {
			break;
		}
		
		if(a[mid] > a[l-1]) {
			start = mid+1;
		}
		else if(a[mid] < a[l-1]) {
			end = mid -1;
		}
		System.out.println(mid);
     }
	
	if(num > a[l-1]) {
		start = 0; end = mid-1;
		while(start<=end) {
			mid = start +(end-start)/2;
			if(a[mid] == num) {
				return mid;
			}
			else if(num>a[mid]){
				 start = mid+1;
			}
			else {
				end = mid-1;
				}
	}}
		else {
			start = mid; end = l-1;
			while(start<=end) {
				mid = start +(end-start)/2;
				if(a[mid] == num) {
					return mid;
				}
				else if(num>a[mid]){
					 start = mid+1;
				}
				else {
					end = mid-1;	
					}
		}
		}
	return -1;
	
}
}
