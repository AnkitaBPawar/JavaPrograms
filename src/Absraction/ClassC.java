package Absraction;

public class ClassC implements interfaceA,InterfaceB {

	//Adding this comment for git repo

	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceB");
	}

	public void merhod1() {
		// TODO Auto-generated method stub
		System.out.println("InterfaceA");
	}

	
	
	public static void main(String[] args) {
		ClassC obj=new ClassC();
		obj.merhod1();
		obj.method2();
	}
}
