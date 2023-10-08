package Recurssion;
import java.util.*;
public class PrintSubsequence {
	public static void main(String[] args ) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string ");
		String s= sc.nextLine();
		printsub(s, "");
	}
		
		public static void printsub(String ques, String ans) {
			if(ques.length()==0) {
				System.out.println(ans);
				return;
			}
			
			char ch= ques.charAt(0);
			String rest= ques.substring(1);
			printsub(rest,ans+ch);
			printsub(rest,ans+"");
			
	}

}
