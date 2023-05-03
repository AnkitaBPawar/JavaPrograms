package Constructor;

public class Demo {

	//constructor is special method in java
	//constructor name should be same as class name
	//constructor dosnt have return type or void 
	//Used to initialize the object
	//To call constructor we need to create object and constructor will get call automatically
	
	
	//Types of constructor
	//1.  0 Argument constructor
	//2.  Parameterized constructor
	//3.  Default construtor
	
	//Can we overload constructor -- yes
	//can we override constructor --
	
int a;  //declaration

int b;

	//0 argument constructor
	public Demo() {
		
		a=5;
		System.out.println(a);
		
	}
	
	//Parameterized constructor
     public Demo(String name) {
		
		System.out.println(name);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		Demo obj=new Demo();
	
		Demo obj1=new Demo("Rahul");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
