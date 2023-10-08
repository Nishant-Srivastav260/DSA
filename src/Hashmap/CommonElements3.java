package Hashmap;
import java.util.*;
import java.io.*;

public class CommonElements3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no. of values in a1");
		int n1=sc.nextInt();
		int[] a1=new int[n1];
		System.out.println("enter values in a1");
	for(int i=0;i<n1;i++)
	{
		a1[i]=sc.nextInt();
		}
	System.out.println("enter no. of values in a2");
	int n2=sc.nextInt();
	int[] a2=new int[n2];
	System.out.println("enter values in a2");
	for(int i=0;i<n2;i++)
	{
		a2[i]=sc.nextInt();
		}
	
	HashMap<Integer,Integer> hm =new HashMap<>();
	for(int key: a1)
	{if(hm.containsKey(key))
	{int n=hm.get(key);
	hm.put(key,++n);
		
	}
	else hm.put(key, 1);
	}
	for(int key:a2) {
		if(hm.containsKey(key)) {
		System.out.println(key);
		hm.remove(key);
		}
		else continue;
	}
	}

}
