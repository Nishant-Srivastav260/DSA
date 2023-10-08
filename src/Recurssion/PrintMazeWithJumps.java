package Recurssion;
import java.util.*;
import java.io.*;
public class PrintMazeWithJumps {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("Enter final row");
	int er=sc.nextInt();
	System.out.println("enter final column ");
	int ec=sc.nextInt();
	printmaze(1,1,er,ec,"");
	}
	public static void printmaze(int sr,int sc, int er,int ec,String ans) {
		if((er==sr)&&(ec==sc)) {
			System.out.println(ans);
			return;
		}
		
		for(int i=1;i<=ec-sc;i++) {
			printmaze(sr,sc+i,er,ec,ans+"h"+i);
		}
		for(int i=1;i<=er-sr;i++) {
			printmaze(sr+i,sc,er,ec,ans+"v"+i);
		}
		for(int i=1;(i<=ec-sc)&&(i<=er-sr);i++) {
			printmaze(sr+i,sc+i,er,ec,ans+"d"+i);
		}
	}

}
