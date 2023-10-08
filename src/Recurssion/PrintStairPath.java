package Recurssion;
import java.util.*;
import java .io.*;
public class PrintStairPath {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of stairs");
		int n=sc.nextInt();
		getpath(n, "");
		
	}
	public static void getpath(int ques, String ans) {
		if(ques==0) {
			System.out.println(ans);
			return;
		}
		if(ques<0) {
			return;
		}
		for(int i=1;i<=3;i++) {
			getpath(ques-i,ans+(char)(i+48));
		}
	}

}
