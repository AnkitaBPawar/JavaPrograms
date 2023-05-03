package ImpPrograms;

public class SeparateNumberandString {
	public static void main(String[] args) {
		
	
	// TODO Auto-generated method stub
			int upper = 0;
			int lower = 0;
			int number = 0;
			int special = 0;

			String s = "asvg$%APb789";

			for (int i = 0; i <= s.length() - 1; i++) {

				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					lower++;
				} else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
					upper++;
				} else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
					number++;
				} else {
					special++;
				}
			}
			System.out.println(lower);
			System.out.println(upper);
			System.out.println(number);
			System.out.println(special);
		}
}
