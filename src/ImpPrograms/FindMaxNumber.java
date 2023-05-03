package ImpPrograms;

public class FindMaxNumber {
	public static void main(String[] args) {
		
	
	int[] a= {7,8,9,20};
	int temp;
	//7 8 9 20
	
	
	for(int i=0;i< a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		
	}
	System.out.println(a[0]);

}
}
