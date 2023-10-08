package Recurssion;
import java.util.*;
public class Recurssion1 {
	
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
	int[] a =new int[n];
	for(int i=0;i<n;i++)
	{a[i]=scn.nextInt();
}
	System.out.println("enter elment to find");
	int num=scn.nextInt();
	System.out.println("the last index of occurence is "+ last(a,num,n-1));
	
}
public static int last(int[] arr,int num, int index) {
	if(index==-1)
		return -1;
	
	int f=last(arr,num,index-1);
	if(arr[index]==num)
		return index;
	else if(f!= -1)
		return f;
	else
		return -1;
	
	}
	}

