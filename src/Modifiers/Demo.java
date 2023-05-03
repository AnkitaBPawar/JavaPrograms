package Modifiers;

public class Demo extends StaticMethod { //class can be public and default

	
    public int a=10;
	private int c=30;
	protected int j=90;
    public void method1() //Method and variable can be private,public,default and protected
	{
		
		System.out.println("Method1");
	}
    
	public static void main(String[] args) {
		
		Demo obj=new Demo();
		System.out.println(obj.c);
        
		
		
	}
}

/*public : accessible in different package
  default : accessible in same package
  private: accessible in same class
  protected : accessible in same package and outside the package using inheritance
*/