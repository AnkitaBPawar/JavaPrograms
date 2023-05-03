package ImpPrograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello I Love java";

		String words[] = s.split(" ");
		// words[]= {"hello","I","Love","java"}

		System.out.println(words.length);// length of array

		System.out.println(words[0].length());

		System.out.println(words[3]);

	
		
		//Reverse String
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
		
		
		
		// Reverse sequence of words in string
		String temp = "";
		for (int i = words.length - 1; i >= 0; i--) {
			temp = temp + words[i] + " ";

		}
		
		System.out.println(temp);
		// words[]= {"hello","I","Love","java"}
		
		// Reverse each word in string
		for(int i=0;i<words.length;i++) { 
			String word=words[i];
			for(int j=word.length()-1;j>=0;j--) {
				
				
				System.out.print(word.charAt(j));
				
			}
			System.out.print(" ");
		}
	}

}
