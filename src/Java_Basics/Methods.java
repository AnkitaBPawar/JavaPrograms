package Java_Basics;

public class Methods {
	
	//Non static method
	public void method1() {
		System.out.println("Non static method- Need to call with object");
	}
	
	//Static method
	public static void method2(){
		System.out.println("Static method - without creating object");
	}
	
	//Parameterized method
	public void method3(int RollNo,String SName) {
		System.out.println(RollNo+" "+SName);
	}
	
	//With return type - It always return something with return keyword
	public int method4() {
		int a = 8;
		return a;
	}
	
	//With return type and static
	public static int method5() {
		int j=10;
		return j;
	}
	
	//Void method- It dosent return anything
	public void method6() {
		int k=90;
		System.out.println(k);
	}
	
	
	//we can use method with return type in another method directly
	public void method7() {
		int r=7+method5();
		System.out.println(r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We have to call the method in main method
		//We have to create object of class to call the method
		//Syntax: classname obj=new classname();
		
		Methods m=new Methods();
		m.method1();
		method2();
		m.method3(20, "Rahul");
		System.out.println(m.method4());
		System.out.println(method5());
		m.method6();
		m.method7();
		
		
	}

}
