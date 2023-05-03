package Polymorphism;

public class MethodOverridingAxisBank extends MethodOverridingBank{
	
	public void checkbalance() {
		System.out.println("Balance is 9000");
	}
	
	public void method2()
	{
		System.out.println("Method from child class");
	}	
	
	public static void main(String[] args) {
	        
		//child class object ---all methods from parent and child class and overriding method from child class will get call
		MethodOverridingAxisBank obj=new MethodOverridingAxisBank();
		obj.checkbalance(); 
		obj.method1();
		obj.method2();
		
		//Parent class object--- Only parent class methods
		MethodOverridingBank obj1=new MethodOverridingBank();
		obj1.checkbalance();
		obj1.method1();
		
		
		//Parent class reference and child class object--- All parent methods get call except overriding method get call from child class
		MethodOverridingBank obj2=new MethodOverridingAxisBank(); //upcasting
		obj2.method1();
		obj2.checkbalance();
		
		
		
		//Child class reference and parent class object-- all methods from parent and child class and overriding method from child class will get call 
		MethodOverridingBank obj3=new MethodOverridingAxisBank(); //downcasting (not used)
		MethodOverridingAxisBank obj4=(MethodOverridingAxisBank)obj3;
		obj4.method1();
		obj4.method2();
		obj4.checkbalance();
		
		
		
		
		
		
		
		
	}
	
	
	

}
