package ImpPrograms;

public class CountWords {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "hello I Love java";

		String words[] = s.split(" ");
		// words[]= {"hello","I","Love","java"}

		System.out.println(words.length);// length of array

		System.out.println(words[0].length());

		System.out.println(words[3]);

		// count of words
		for (int i = 0; i < words.length; i++) {
			System.out.println(words[i].length());
		}

}
}
