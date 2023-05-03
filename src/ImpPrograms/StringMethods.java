package ImpPrograms;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String a="Hello Java";
		String b="hello java";
		String c="Hello Java";
		String d=" ";
		String e=" Hii ";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c)); //Gives 0 when strings are exactly same ascii value
		System.out.println(a.compareToIgnoreCase(b)); //Gives 0 when strings are same inspite of case
		System.out.println(a.compareToIgnoreCase(c));
		
		System.out.println(a.concat(" "+c));
		System.out.println(a.contentEquals(c)); //Gives true when string is exactly the same
		System.out.println(a.contentEquals(b));
		System.out.println(d.isEmpty()); //Gives true when string is does not contain space or char
		System.out.println(d.isBlank()); //Gives true when string is does not contain char
		System.out.println(e.trim()+ a); //With trim
		System.out.println(e+a); //Without trim
		System.out.println(a.toLowerCase());
		System.out.println(b.toUpperCase());
		System.out.println(a.replace('H','R'));
		System.out.println(a.replace("Java", "Ankita"));
		System.out.println(a.contains("Java"));
		System.out.println(a.equals(c));
		System.out.println(a.equalsIgnoreCase(b));//gives true unlike compare to gives 0
		System.out.println(a.endsWith("u"));
		
		//substring
		System.out.println(a.substring(2));
		System.out.println(a.substring(6, 10));
		
		//split
		String k="Hello there";
		String[] o=k.split(" ");
		for(String l:o) {
			System.out.println(l);
		}
		System.out.println("length: "+o.length);
		
		//split  by multiple delimeters
		String str="Hello! Good morning.How Are you? Jake";
		String[] str1=str.split("[! .?]+");
		for(String str3:str1) {
			System.out.println(str3);
		}
		System.out.println("Length: "+str1.length);
		
		
		
		
		
		
		
		
		
		char[] c1=a.toCharArray();
		for(char d1:c1) {
			System.out.print(d1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
