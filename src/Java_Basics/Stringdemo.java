package Java_Basics;

public class Stringdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// length starts with 1
		// index starts with 0 =length-1
		String a = "Hello I Love Java";
		System.out.println(a);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());

//Find character at specific index
		System.out.println(a.charAt(6));

		String a1 = "Hello";
		String a2 = "Java";
		System.out.println(a1.concat(" " + a2));
		System.out.println(a1 + a2);

//Escape character -
		System.out.println("Hello \"Love\" Java");
		System.out.println("Hello \\\\java");

//trim
		String z = "   Hello Java   ";
		System.out.println(z.trim());

//Substring
		String L = "Hello I Love Java";
		System.out.println(L.substring(3));
		System.out.println(L.substring(2, 6));

//equals,equalsIgnoreCase,contains

		String r1 = "Java";
		String r2 = "java";
		String r3 = "Java";
		String r4 = "Hello";
		System.out.println(r1.equals(r2));
		System.out.println(r1.equals(r3));

		System.out.println(r1.equalsIgnoreCase(r2)); // ignores lowercase and upperscase
		System.out.println(r1.contains(r3));
		System.out.println(r1.contains(r2));
		System.out.println(r1.contains(r4));
		//System.out.println(r4.);

	}
}
