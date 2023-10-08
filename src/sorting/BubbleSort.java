package sorting;

import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size");
		int n=sc.nextInt();
		System.out.println("Enter array");
		int[] a =new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n-i;j++) {
				if(a[j]<a[j-1]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
			
	}

}
