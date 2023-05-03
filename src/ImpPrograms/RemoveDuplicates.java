package ImpPrograms;

import java.util.HashSet;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s="ramramar";
		
		char[] c=s.toCharArray();//To convert into char array
		
		//c={'r','a','m'...}
		
		HashSet<Character> obj=new HashSet<Character>();
		
	
		for(char k:c)
		{
			obj.add(k);
		}
		System.out.println(obj);
		
	}

}
