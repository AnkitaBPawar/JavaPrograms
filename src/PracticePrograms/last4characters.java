package PracticePrograms;

public class last4characters {
	
	public static void main(String[] args) {
		
		
		
		String s="Ankita Pawar";
		String last=s.substring(s.length()-4);
		
		for(int i=0;i<last.length();i++) {
			System.out.print(last.charAt(i));
		}
		System.out.println();
		
		String first=s.substring(0, 4);
		System.out.println("First 4 characters:"+first);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
