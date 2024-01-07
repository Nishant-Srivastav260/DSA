package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		
		int[] a= {5,67,4,78,35,2,1};
		
		int[] sorted=new int[a.length];
		 sorted =mergeSort(a);
		 
		 for(int i=0;i<a.length;i++) {
			 System.out.print(sorted[i]+" ");
		 }
       
	}

	public static int[] mergeSort(int[] a) {
		
		if(a.length==1) {
			return a;
		}
		
		int mid=a.length/2;
		
		int[] left= mergeSort(Arrays.copyOfRange(a, 0, mid));  //last index is not included
		int[] right=mergeSort(Arrays.copyOfRange(a, mid, a.length));
		
		return merge(left, right);
	}
	
	public static int[] merge(int[] left, int[] right) {
		
		int[] mix=new int[left.length+right.length];
		
		int i=0,j=0,k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				mix[k]=left[i];
				i++;
			}
			else {
				mix[k]=right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		return mix;
	}
}
