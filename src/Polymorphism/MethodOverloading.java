package Polymorphism;

public class MethodOverloading {

	//method should have same name but different parameters
	
	
	//1---Different numbers of parameters
	//2---same number of parameters but with different datatypes
	//3---sequence of parameters should be different
	
	
	public void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	public void addition(double c,double d) {
		System.out.println(c+d);
	}
	
	public double addition(int a,double b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.addition(10,20);
		obj.addition(10.2, 30.9);
	}
	
	
	
	
	
	
	
	
	
	
	
}
