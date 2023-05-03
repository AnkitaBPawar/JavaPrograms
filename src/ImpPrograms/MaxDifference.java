package ImpPrograms;

public class MaxDifference {
	public static void main(String[] args) {
		
		int [] a= {4,6,1,7,9};
		int diff=0;
		
		for(int i=0;i<a.length-1;i++) {
			if(a[i+1]-a[i]>diff) {
				diff=a[i+1]-a[i];
			}
		}
		
		System.out.println(diff);
		
		
		
		
		
	}

}
