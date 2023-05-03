package Inheritance;

public class MultiLevelDog extends MultiLevelAnimal {
	public void method2() {
		System.out.println("Parent method");
	}
	
    public static void main(String[] args) {
    	MultiLevelDog obj=new MultiLevelDog();
    	obj.method1();
	}
}
