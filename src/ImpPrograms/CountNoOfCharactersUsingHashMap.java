package ImpPrograms;

import java.util.HashMap;

public class CountNoOfCharactersUsingHashMap {
	
	
    public static void main(String[] args) {
		
    	
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
    	
    	for(char i:hm.keySet()) {
    		System.out.println(i+" "+hm.get(i));
    	}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}
}