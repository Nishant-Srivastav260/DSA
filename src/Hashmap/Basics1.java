package Hashmap;

import java.util.HashMap;
import java.util.Set;

public class Basics1 {
	public static void main(String[] args) {
	HashMap<String,Integer> hm=new HashMap<>();
	hm.put("India", 125);
	hm.put("China",150);
	hm.put("US", 100);
	System.out.println(hm);
	

	System.out.println(hm.get("US"));
	System.out.println(hm.get("Pak"));
	System.out.println(hm.containsKey("US"));
	
	
	
	for(String key: hm.keySet())
	{Integer val=hm.get(key);
	System.out.println(key+ " "+ val);
	}
	hm.remove("China");
	System.out.println(hm);
	
	
}

}
