package Java_Basics;

public class ArithmeticOperators {

	public static void main(String args[]) {
		
		//Arithmetic operators-- +,-,*,%,/, increment,  decrement
		//Assignment operator-- =
		//Comparison operator-- <,>,<=,>=, ==, !=
		//Conditional operator-- &&, || , !
		int a=40;
		int b=20;
	    int c=a+b;
		
	    System.out.println(c);
		
		int d=a-b;
		System.out.println(d);
		
		int e=a*b;
		System.out.println(e);
		
		int f=a/b;
		System.out.println(f);
		
		int g=a%b;
		System.out.println(g);
		
		
		
		//Increment --- Preincrement Postincrement
		int ab=10;
		System.out.println(++ab); //shows incremented value
		System.out.println(ab);
		
		int ac=20;
		System.out.println(ac++); //shows incremented value later
		System.out.println(ac);
		
		//Decrement --- Predecrement Postdecrement
		int ad=10;
		System.out.println(--ad); //9
		System.out.println(ad);   //9
		
		int ae=20;
		System.out.println(ae--);  //20
		System.out.println(ae);     //19
		
		
		//Comparison operators
		
	    int  de=10;
	    System.out.println(de<10);  //false
	    System.out.println(de<=10); //True
	    System.out.println(de>10);  //False
	    System.out.println(de>=10); //True
	    System.out.println(de==10); //True
	    System.out.println(de!=10); //False
		
	  //Conditional operator-- AND, OR, NOT
	    
		/*  Logical && - Returns true if both the conditions are true
		 *  Logical || - Returns true if any one of the condition is true
		 *  Logical !  - Reverse the result
		 */
		
	    
	    int kp= 10;
	    System.out.println(kp>11 && kp<11);
	    System.out.println(kp>11 || kp<11);
	    System.out.println(!(kp>11 || kp<11));
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	}
}
