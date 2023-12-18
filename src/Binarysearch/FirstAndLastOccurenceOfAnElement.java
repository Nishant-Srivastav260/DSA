package Binarysearch;

public class FirstAndLastOccurenceOfAnElement {
  
	public static void main(String[] args) {
		
		int[] a = {1,3,5,8,8,45,67};
		System.out.println(firstOccurence(a, 8));
		System.out.println(lastOccurence(a, 8));
		//Count of an Element
		System.out.println(lastOccurence(a, 8) - firstOccurence(a, 8) + 1);
	}
	public static int firstOccurence(int[] a , int num) {
		int start =0, end = a.length -1;
		int mid =0; int first =-1;
		
		while(start<= end) {
			mid = start + (end -start)/2;
			
			if(num == a[mid]) {
				first = mid;
				end = mid -1;
			}
			else if( num < a[mid]) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
		}
		return first;
	}
	public static int lastOccurence(int[] a , int num) {
		int start =0, end = a.length -1;
		int mid =0; int last =-1;
		
		while(start<= end) {
			mid = start + (end -start)/2;
			
			if(num == a[mid]) {
				last = mid;
			    start = mid +1;
			}
			else if( num < a[mid]) {
				end = mid -1;
			}
			else {
				start = mid +1;
			}
		}
		return last;
	}
	
}
