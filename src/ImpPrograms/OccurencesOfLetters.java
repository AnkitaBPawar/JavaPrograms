package ImpPrograms;

public class OccurencesOfLetters {
	public static void main(String[] args) {
		String s="Java Programming is very good";
		
		int count = 0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='a') {
				
				count++;
			}
		}
		
		System.out.println("Occurence of letter a:"+count);
		
		
		
		
		
		
		
		
		
		
		
	}

}
