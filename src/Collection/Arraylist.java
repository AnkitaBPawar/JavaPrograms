package Collection;

import java.util.ArrayList;

public class Arraylist {
	
	//list - interface
	//ArrayList - class
	
	public static void main(String[] args) {
		
		ArrayList<Integer> obj=new ArrayList<Integer>();
		
		obj.add(10); //adding value
		obj.add(20);
		obj.add(30);
		obj.add(10);
		
		System.out.println(obj);
		
		System.out.println(obj.get(3));
		
		obj.add(2, 45);//add element
		
		obj.set(0, 66);//to replace element
		
		System.out.println(obj.contains(10));
		
		//obj.remove(2);
		
		System.out.println(obj.size());
		
		//obj.clear();
		
		System.out.println(obj.contains(10));
		
		//System.out.println(obj);
		
		//Print with for loop
		for(int i=0;i<obj.size();i++) {
			
			System.out.println(obj.get(i));
		}
		
		//for each loop
		for(int k:obj) {
			System.out.println(k);
		}
		
		
		
		
		
	}

}
