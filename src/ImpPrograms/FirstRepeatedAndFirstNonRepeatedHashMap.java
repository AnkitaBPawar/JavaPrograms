package ImpPrograms;

import java.util.HashMap;

public class FirstRepeatedAndFirstNonRepeatedHashMap {
	
	public static void main(String[] args) {
		
		//key value
		//hm.get() --to access value
		//hm.put(key,value) --to access both
		
	   	String s="aaabbbccd";
    	char [] c= s.toCharArray();
    	
    	HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
    	
    	for(int i=0;i<c.length;i++) {
    		
    		if(hm.containsKey(c[i])) {
    			hm.put(c[i], hm.get(c[i]) + 1);
    		}
    		else {
    			hm.put(c[i], 1);
    		}
    		
    	}
    	
    	//First Non Repeated
    	
    	for(int i=0;i<c.length;i++) {
    		if(hm.get(c[i])==1) {
    			System.out.println("First Non Repeated="+c[i]);
    			break;
    		}
    		
    	}
    	
    	
    	//First Repeated
    	
    	for(int i=0;i<c.length;i++) {
    		if(hm.get(c[i])>1) {
    			System.out.println("First Repeated="+c[i]);
    			break;
    		}
    		
    	}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
