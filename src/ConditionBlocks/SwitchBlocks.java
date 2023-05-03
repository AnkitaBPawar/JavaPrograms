package ConditionBlocks;

public class SwitchBlocks {

	public static void main(String args[]) {
		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;

		default:
			System.out.println("Sunday");

		}
		char vowels = 'f';
		switch (vowels) {
		case 'a':
			System.out.println("vowel a");
			break;
		case 'e':
			System.out.println("vowel e");
			break;
		case 'i':
			System.out.println("vowel i");
			break;
		default:
			System.out.println("Not a vowel");

		}

		String month = "January";
		switch (month) {
		case "January":
			System.out.println("It is a month");
			break;
		case "February":
			System.out.println("It is a month");
			break;
		case "March":
			System.out.println("It is a month");
			break;
		case "April":
			System.out.println("It is a month");
			break;
		default:
			System.out.println("Not a month");

		}

	}

}
/*
 * switch(expression){ case value1: //code to be executed; break; //optional
 * case value2: //code to be executed; break; //optional ......
 * 
 * default: code to be executed if all cases are not matched; }
 */