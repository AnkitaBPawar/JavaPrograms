package Arrays;

import java.util.Arrays;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Array : To store multiple values
		// We can't add or remove array values we can only replace the value
		// Array size is fixed
		
		int []a= {10,20,30,40,50};
		
		System.out.println(a.length);//To find length
		
		System.out.println(a[2]); // To access specific value
		
		a[2]=59;  //Replace
		
		System.out.println(a[2]);
		
		// a[5]=90; //This is not possible
		
		
		System.out.println(Arrays.toString(a));// First way to array
		
		//Second way
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
			
		}
		
		
		//Third way Enhanced FOR LOOP
	    //for(dataType NewVariable:OldVariable)
		for(int b:a) {
			if(b<=20) {
			System.out.println(b);
			}
			else
			{
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
