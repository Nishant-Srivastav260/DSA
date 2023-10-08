package Hashmap;
import java.util.*;
import java.io.*;
public class KLargestNumbers {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no. of elements");
		int l=sc.nextInt();
		int[] a=new int[l];
		
		System.out.println("enter the no. of ele in longest seqence ");
		int k=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<l;i++) {
			a[i]=sc.nextInt();
;		}
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<l;i++) {
			if(i<k) {
				pq.add(a[i]);
				}
			else if(a[i]>pq.peek())
			{ pq.remove();
			pq.add(a[i]);
			}
				
		}
		
		for(int i=0;i<k;i++) {
			System.out.println(pq.peek());
			pq.remove();
		}
			
		
	}

}
