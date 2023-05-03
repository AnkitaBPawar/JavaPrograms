package Constructor;

public class defaultConstructor {

	// default constructor will get call here
	//when we only declare variables but dont initialize value default constructor get call
	//default constructor provides default values depending on datatype
	// compiler will call the default constructor
	 
	 /*1. Default Constructors :-
	 -> Whenever we dont create any constructor in 
	 class, then compiler will always create a constructor 
	 which is known as default constructor
	 -> Default constructors are used to provide the 
	 default values to the objects like 0, null etc 
	 depending on the datatype.
	 
	 4
	 -> Note : If programmer creates any one 
	 constructor then compiler will not generate default 
	 constructor
	 */

	
	
	int a;
	String b;
	boolean c;
	
	
	
	public static void main(String[] args) {
		
		defaultConstructor obj = new defaultConstructor();
		
		System.out.println(obj.a);
		
		System.out.println(obj.b);
		
		System.out.println(obj.c);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
