package ImpPrograms;

public class FindDuplicateNumber {
	
	public static void main(String[] args) {
		
		int [] a= {10,20,40,20,10,50,90};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
				
			}
			
			
			
		}
		
		
		
		
	}

}
