package sorting;

public class InsertionSort {
	public static void main(String[] args) {
		
		int[] a= {5,4,6,3,2,1};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j>0;j--) {
				if(a[j]<a[j-1]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
