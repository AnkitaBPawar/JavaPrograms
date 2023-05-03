package ExceptionHandling;

public class Finally {
	
	public static void main(String[] args) {
		
		
		 /*
		  * 
		  * 
		  *    
		    Finally:The finally statement lets you execute code, after try...catch, regardless of the result:

		     finally {
		         System.out.println("The 'try catch' is finished.");
		       }
		   }
		  */
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
		finally {
			System.out.println("Hello");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
