package dynamic_programming;

import java.util.*;

public class StocksQuery {
    public static void main(String[] args) {
        String[] events = {"BUY googl 20", "BUY aapl 50", "CHANGE googl 6", "QUERY", "SELL aapl 10", "CHANGE aapl -2", "QUERY"};
        
        System.out.println(queryStocks(events));
    }
    
  
    public static List<Integer> queryStocks(String[] events){
    	Map<String, Integer> hm = new HashMap<>();
    	List<Integer> query = new ArrayList<>();
    	int profit = 0;
    	for(String event : events) {
    		String[] word = event.split("\\s");
    		
    		if(word[0].equalsIgnoreCase("BUY")) {
    			if(hm.containsKey(word[1])) {
    				int value = hm.get(word[1]) + Integer.parseInt(word[2]);
    				hm.put(word[1], value);
    			}
    			else {
    				hm.put(word[1], Integer.parseInt(word[2]));
    			}
    		}
    		else if(word[0].equalsIgnoreCase("SELL")) {
    			if(hm.containsKey(word[1])) {
    				int value = hm.get(word[1]) - Integer.parseInt(word[2]);
    				hm.put(word[1], value);
    			}
    			else {
    				System.out.println("Invalid Event.. You have no stocks");
    			}
    		}
           else if(word[0].equalsIgnoreCase("CHANGE")) {
        	   if(hm.containsKey(word[1])) {
   				int change = hm.get(word[1]) * Integer.parseInt(word[2]);
   				profit = profit+change;
   				
   			}
        	   else {
        		   System.out.println("Invalid Event.. You have no stocks");
   			}
        	   }
        	   
           else if(word[0].equalsIgnoreCase("QUERY")) {
   			  query.add(profit);
   		}
    		
    	}
    	return query;
    }
  
}

