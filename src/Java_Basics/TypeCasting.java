package Java_Basics;

public class TypeCasting {

	public static void main(String args[]) {

		/*
		 * Widening Casting (automatically) - converting a smaller type to a larger type
		 * size--implicit type casting byte -> short -> char -> int -> long -> float ->
		 * double
		 * 
		 * Narrowing Casting (manually) - converting a larger type to a smaller size
		 * type----explicit type casting double -> float -> long -> int -> char -> short
		 * -> byte
		 */

		/*
		 * //Widening int a= 10; long b=a; System.out.println(b);
		 * 
		 * int c=900; float d=c; System.out.println(d);
		 * 
		 * char x='a'; int z=x; System.out.println(z);
		 * 
		 * short ss=56; char sd=(char)ss; System.out.println(sd);
		 * 
		 * 
		 * //Narrowing float s= 10.6f; int i=(int)s; System.out.println(i);
		 * 
		 * double o=20.88; long l=(long)o; System.out.println(l);
		 * 
		 * int aa=678; byte as=(byte)aa; System.out.println(as);
		 */

		// Widening
		long a = 10;
		double b = a;
		System.out.println(b);

		float c = 900;
		double d = c;
		System.out.println(d);

		char x = 'i';
		float z = x;
		System.out.println(z);

		// Narrowing
		double s = 10.90;
		int i = (int) s;
		System.out.println(i);

		float o = 71.01f;
		char l = (char) o;
		System.out.println(l);

		char aa = 'Z';
		byte as = (byte) aa;
		System.out.println(as);

	}

}
