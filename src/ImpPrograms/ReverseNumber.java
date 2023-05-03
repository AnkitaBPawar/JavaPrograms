package ImpPrograms;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		  int number = 987654, reverse = 0;
		  while (number != 0) {

		   int remainder = number % 10; //8
		   reverse = reverse * 10 + remainder; //8
		             /* 0 *10+4= 4
		              4*10+5= 45  
		              45*10+6=456
		              456*10+7= 4567
		              4567*10+8= 456789*/
		              
		    
		   number = number / 10;  //98
		  }
		  System.out.println("The reverse of the given number is:" + reverse);

		 }

		
		
		
		
		
		
	}


