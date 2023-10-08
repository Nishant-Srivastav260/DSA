package Recurssion;
import java.util.*;
import java.io.*;
public class PrintEncoding {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		printenc(s,"");
		
	}
	public static void printenc(String ques, String ans) {
		
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		else if(ques.length()==1) {
			char ch=ques.charAt(0);
			if(ch=='0')
				return;
			else {
				int code= ch-'0';
				char ch1=(char)('a'+code-1);
				ans=ans+ch1;
				System.out.println(ans);
				}
		}
		else {
			char ch2=ques.charAt(0);
			String rest=ques.substring(1);
			if(ch2=='0')
				return;
			else {
				int code1= ch2-'0';
			 char ch3=(char)('a'+code1-1);
				printenc(rest,ans+ch3);
			}
			String a1=ques.substring(0,2);
			String a2=ques.substring(2);
			int n=Integer.parseInt(a1);
			if(n<=26) {
				char ch4=(char)('a'+n-1);
				printenc(a2,ans+ch4);
			}
			}
		}

}
