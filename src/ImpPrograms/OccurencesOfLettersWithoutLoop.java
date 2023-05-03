package ImpPrograms;

public class OccurencesOfLettersWithoutLoop {
	public static void main(String[] args) {
		String s="Java Programming";
		
		int TotalLength=s.length();
		int afterRemove=s.replace("a","").length();
		int  count=TotalLength-afterRemove;
		
		System.out.println("Occcurence of a:"+count);
		
		
		
		
	}

}
