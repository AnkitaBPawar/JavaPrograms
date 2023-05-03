package ImpPrograms;

public class SumOfNumberFromString {
	
	public static void main(String[] args) {
		
		String s="A2KL963%";
	    char[] c=s.toCharArray();
	    
	    int sum=0;
	    for(int i=0;i<c.length;i++) {
	    	
	    	if(Character.isDigit(c[i])) {
	    		int k=Integer.parseInt(String.valueOf(c[i]));
	    		sum=sum+k;
	    		
	    		
	    	}
	    }
	    System.out.println(sum);
		
		
		
		
		
		
		
		
		
		
	}

}
