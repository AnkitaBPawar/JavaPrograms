package Collection;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<String,String> hm=new HashMap<String,String>();
		
		hm.put("MH", "Mumbai");
		hm.put("KR", "Bangluru");
		hm.put("GRJ", "Gandhinagar");
		hm.put("MH", "Mumbai");
		
		
		System.out.println(hm);
		
		System.out.println(hm.get("MH"));
		
		hm.remove("MH");
		
		System.out.println(hm);
		
		//To print only keys
		for(String k:hm.keySet()) {
			
			System.out.println(k);	
			
		}
		
		//To print only Values
		for(String h:hm.values()) {
			System.out.println(h);
		}
		
		
		//To print both values and keys
		for(String l:hm.keySet()) {
			
		System.out.println(l+" "+hm.get(l));
		}
		
		
		
		
		
	}
	
	
	
	

}
