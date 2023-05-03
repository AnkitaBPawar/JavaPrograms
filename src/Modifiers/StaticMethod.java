package Modifiers;

public class StaticMethod {
	
	
	static int a=10;
	
	
	public static void method()
	{
	  System.out.println("method");	
	}
	
	
	public static void main(String[] args) {
		StaticMethod.method();
		System.out.println(StaticMethod.a);
	}
}
