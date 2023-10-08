package Hashmap;
import java.util.*;
import java.io.*;

public class Frequency2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		HashMap<Character,Integer> hm= new HashMap<>();
		
		for(int i=0; i<s.length();i++)
		{char ch =s.charAt(i);
		if(hm.containsKey(ch)) {
			int n=hm.get(ch);
			hm.put(ch, ++n);
			
	}
		else hm.put(ch,1);

			
		}
		System.out.println(hm);
		char mfc=s.charAt(0);
		for(Character key: hm.keySet())
		{if(hm.get(key)>hm.get(mfc))
		mfc=key;
		else continue;
		
		}
		System.out.println(mfc +" has highest frequecy "+ hm.get(mfc));
		
	}

}
