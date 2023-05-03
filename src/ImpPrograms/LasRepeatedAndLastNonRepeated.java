package ImpPrograms;

import java.util.HashMap;

public class LasRepeatedAndLastNonRepeated {
	
	public static void main(String[] args) {
		
	
	String s="aaabbbrccd";
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
	
	//Last Non Repeated
	
	for(int i=c.length-1;i>=0;i--) {
		if(hm.get(c[i])==1) {
			System.out.println("Last Non Repeated:"+c[i]);
			break;
		}
		
	}
	
	
	//Last Repeated
	
	for(int i=c.length-1;i>=0;i--) {
		if(hm.get(c[i])>1) {
			System.out.println("Last Repeated:"+c[i]);
			break;
		}
		
	}
	
	}	

}
