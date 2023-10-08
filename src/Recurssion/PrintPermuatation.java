package Recurssion;
import java.util.*;
import java.io.*;
public class PrintPermuatation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		printper(str,"");
	}
	
	public static void printper(String s, String ans) {
		if(s.length()==0) {
			System.out.println(ans);
             return;	
             }
			
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			String temp=s.substring(0,i)+s.substring(i+1);
			printper(temp,ans+ch);
		}
	}

}
