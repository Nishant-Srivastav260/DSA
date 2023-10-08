package Hashmap;
import java.util.*;
import java.io.*;
public class NearlySortedArray7 {
	public static void main (String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length of aray");
		int l=sc.nextInt();
		int[] a= new int[l];
		System.out.println("Enter the array ");
		for(int i=0;i<l;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the maxm no. by which the elments are shifted");
		int k=sc.nextInt();
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<l;i++)
		{
			if(i<k+1)
			{pq.add(a[i]);
		}
			if(i==k) {
				a[i-k]=pq.peek();
				pq.remove();
			}
			if(i>=k+1) {
				pq.add(a[i]);
				a[i-k]=pq.peek();
				pq.remove();
			}
				
			}
		System.out.println("Sorted array");
		for(int i=0;i<l;i++) {
			System.out.print(a[i]+ " ");
			
		}
				
	}
	

}
