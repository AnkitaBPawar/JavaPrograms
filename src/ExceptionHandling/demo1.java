package ExceptionHandling;

public class demo1 {
	public static void main(String[] args) {
		
		
		int a=10;
		int b=0;
		
		
		try {
			int c=a/b;
			System.out.println(c);

		}
		catch(Exception e){
			//e.printStackTrace();
			System.out.println("Cant divide by 0");
		}
		
		System.out.println("Hello");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
