package Hashmap;
import java.util.*;
import java.io.*;

public class LongestConsecutiveSequence5 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println(" Enetr length of array");
	int l=sc.nextInt();
	int[] a=new int[l];
	System.out.println(" Enter array");
	for(int i=0;i<l;i++) {
		a[i]=sc.nextInt();
	
	}
	HashMap<Integer,Boolean> hm=new HashMap<>();
	for(int key: a) {
		hm.put(key,true);
	}
	for(int key:a) {
		if(hm.containsKey(key-1)) {
			hm.put(key,false);
		}
	}
	int msp=0; int m=0;int tsp=0;
	for(int key: a) {
		if(hm.get(key)==true) {
			int t=1; tsp=key; 
			
			while(hm.containsKey(tsp+t)) {
					t++;
				}
			if(t>m) {
				msp=tsp;
			m=t;
			}
		}
			
	}
	for(int i=0;i<m;i++) {
		System.out.println(msp+i);
	}
}

}
