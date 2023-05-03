package Loops;

public class ForLoop {
	public static void main(String args[]) {

		/*
		 * syntax for loop for(initialization,condition,increment/decrement)
		 
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}

		for (int j = 10; j >= 1; j--) {

			System.out.println(j);
		}
        int rows=6;
		for (int k = 0; k < rows; k++) {
			for (int r = 0; r <= k; r++) {
				System.out.println("*");
			}
			System.out.println();
		}
		  */ 
		//i for rows and j for columns      
		//row denotes the number of rows you want to print  
		int i, j, row=6;   
		//outer loop for rows  
		for(i=0; i<row; i++)   
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("*");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		}   
		} 
	


