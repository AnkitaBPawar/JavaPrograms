package Differences;



	//this refers to current class object
	//super refers to parent class object
	
//cannot be used inside static context
//cannot use super keyword in parent class

	class A
	{
		int a=10;
	}
	
	class B extends A
	{
		int a=20;
		void show(int n) 
		{
			System.out.println(n);
			System.out.println(this.a);
			System.out.println(super.a);
		}
		
	}
	public class ThisAndSuper {	
	     public static void main(String[] args) {
			
	    	 B obj=new B();
	    	 obj.show(30);
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
		}
		
		
	}
	
	/*
	-> The super keyword is a reference variable
	which is used to refer immediate parent class object
	-> Use of super keyword :-
	1. super keyword can be used to refer the
	immediate parent class instance variable
	2. super keyword can be used to invoke
	parent class method
	3. super keyword is used to invoke parent
	class constructor
	-> super() should always be the first
	statement in constructor*/
	
	
	
	
	

