package ExceptionHandling;

public class MultipleCatch2 {

	public static void main(String[] args) {
		
      //Exception is handle in 1st catch block but second catch block can be used for another exception
		int a=10;
		int b=0;
		
		
		try {
			int c=a/b;
			System.out.println(c);

		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		
		catch(Exception e){
			System.out.println("Cant divide by 0");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
