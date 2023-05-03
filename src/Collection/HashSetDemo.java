package Collection;

import java.util.HashSet;

public class HashSetDemo {

	//set - interface
	//hashset - class
	//Hashset does not allow duplicate values
	//Sequence is not fixed
	
	public static void main(String[] args) {
		
		HashSet<Integer> obj=new HashSet<Integer>();
		
		obj.add(11);
		obj.add(22);
		obj.add(33);
		obj.add(11);
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		//Cant use for loop only For each loop
		for(int i:obj) {
			
			System.out.println(i);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
