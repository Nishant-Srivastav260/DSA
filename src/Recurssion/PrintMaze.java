package Recurssion;

import java.util.Scanner;

public class PrintMaze {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int er=sc.nextInt();
		System.out.println("Enter the column");
		int ec=sc.nextInt();
		printmaze(1,1,er,ec, "");
	}
	
	public static void printmaze(int sr,int sc,int er,int ec,String ans) {
		if(sr==er&&sc==ec) {
			System.out.println(ans);
		}
		
		if(sr<er) {
			printmaze(sr+1,sc,er,ec,ans+"h");
			
		}
		if(sc<ec) {
			printmaze(sr,sc+1,er,ec,ans+"v");
		}
	}

}
