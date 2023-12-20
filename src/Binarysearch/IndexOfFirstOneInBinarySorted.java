package Binarysearch;

public class IndexOfFirstOneInBinarySorted {
public static void main(String[] args) {
	int[] a = {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1};
	System.out.println(indexOfFirstOne(a));
	
}
public static int indexOfFirstOne(int[] a) {
	int start =0, end =1, mid =0; int least = -1;
	 while(start<=end) {
		 if(1 > a[end]) {
			 start = end;
			 end= end*2;
		 }
		 else {
			 mid = start + (end-start)/2;
			 if(1 == a[mid]) {
				 least = mid;
				end = mid-1; 
			 }
			 else if(1>a[mid]) {
				 start = mid+1;
			 }
		 }
		 
	   }
	 return least;
}

  
}
