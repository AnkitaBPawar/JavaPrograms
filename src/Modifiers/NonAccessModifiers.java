package Modifiers; //Access Specifiers

final class NonAccessModifiers {
	
	final void method() {
		
	}
    
	static void method2() {
		
	}
	
	
	
	public static void main(String[] args) {
		NonAccessModifiers n=new NonAccessModifiers();
		n.method();
        NonAccessModifiers.method2();
	}
	/*
	 * Non access modifiers:
	 * For classess -- 
	 * Final: the class can not be inherited by other class (can create object)
	 * abstract: can not create object of the class
	 * 
	 * For  attributes , methods
	 * Final: attributes and methods can not be overriden and modified
	 * Static: attributes and methods belongs to the class, rather than an object > classname.variable
	 * abstract: can be only used in abstract class and method does not have body
	 */

}
