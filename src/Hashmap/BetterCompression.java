package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class BetterCompression {

	public static void main(String[] args) {
		
		System.out.println(betterSolution("a34b5c36b5c4g7a4z6"));
		
	}
	
	public static String betterSolution(String s) {
		
	    Map<Character, Integer>	 hm = new HashMap<>();
	    String answer= "";
	    String number = ""; char currentCharacter = s.charAt(0);
	    for(int i=1; i<s.length();i++) {
	    	char ch = s.charAt(i);
	    	System.out.println(currentCharacter);
	    	if(ch>= 48 && ch <= 57) {
	    		number = number + ch;
	    	}
	    	
	    	if(( ch > 57) || i == s.length()-1) {
	    		if(hm.containsKey(currentCharacter)) {
	    			int value = hm.get(currentCharacter) + Integer.parseInt(number);
	    		    hm.put(currentCharacter, value);
	    		    
	    		}
	    		else {
	    			hm.put(currentCharacter, Integer.parseInt(number));
	    		}
	    		number = "";
	    		if(i!=s.length() -1) {
	    			currentCharacter = ch;
	    		}
	    		else {
	    			currentCharacter = ' ';
	    		}
    		    
	    	}
	    	
	    }
	    
	    
	    for(char ch = 'a' ; ch <= 'z'; ch++) {
	    	if(hm.containsKey(ch)) {
	    		answer = answer + ch + hm.get(ch);
	    	}
	    }
	    return answer;
	}
}
