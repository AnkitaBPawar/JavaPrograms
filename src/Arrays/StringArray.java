package Arrays;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []s= {"Ankita","Bhagya","Kiran","Neha"};
		
		System.out.println(s.length);
		
		System.out.println(s[0]);
		
		s[2]="Jyoti";
		
		System.out.println(s[2]);
		
		
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
		
		System.out.println("For enhanced");
        for(String k:s)
        {
        	System.out.println(k);
        }
		
	}

}
