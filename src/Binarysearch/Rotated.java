package Binarysearch;

import java.util.Scanner;

public class Rotated {
	public static void main(String[] args)
	{ int temp=0; int temp1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements ");
		int p=sc.nextInt();
		int[] a=new int[p];
	for(int i=0;i<p;i++)
		{a[i]=sc.nextInt();
		}
	int start=0; int end=p-1; int mid=0;
	System.out.println("uhi");
	while(start<=end)
	{mid=start+(end-start)/2;
	if((a[mid-1]>a[mid])&& (a[mid+1]>a[mid]))
		temp=mid;
	if(a[mid]>a[start])
		start=mid;
	else
		end=mid;
	if(a[mid]<a[end])
		end=mid; else start=mid;
	
	}
	temp1=p-temp;
	System.out.println(temp1);
}
}