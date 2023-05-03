package ImpPrograms;

public class PigLatin {

	public static void main(String[] args) {

		String s = "Rahul";
		// output -- ahulRAY
		
		String temp="";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				
				//substring start index , end -1
				temp=s.substring(i)+s.substring(0, i)+"AY";
				    // ahul + r +  AY
				break;

			}
			
		}
		System.out.println(temp);

	}

}
