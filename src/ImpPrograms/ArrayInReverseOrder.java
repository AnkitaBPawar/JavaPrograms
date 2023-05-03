package ImpPrograms;

import java.util.Arrays;

public class ArrayInReverseOrder {
	public static void main(String[] args) {
		  // TODO Auto-generated method stub
		  
		  //print the array in Reveres order
		    int a[]= {10,20,89,40,50};
		    
		    System.out.println(Arrays.toString(a));
		    
		    for(int i=4;i>=0;i--) {
		     System.out.print(a[i]+" ");
		    }

}
}