package ExceptionHandling;

public class MultipleCatch {
	
	public static void main(String[] args) {
		
		//Exception is handle by 1st catch block so need of other catch block
		
		
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);

		}
		catch(Exception e){
			System.out.println("Cant divide by 0");
		}
		
		//Compile time error-- Unreachable block
		/* catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Arithmetic exception");
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
