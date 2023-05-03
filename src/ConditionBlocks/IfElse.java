package ConditionBlocks;

public class IfElse {

	public static void main(String args[]) {
		int studentMarks = 80;
		if (studentMarks > 90) {

			System.out.println("Distinction");
		}

		else if (studentMarks > 70 && studentMarks <= 90) {

			System.out.println("First Class");
		}

		else if (studentMarks > 50 && studentMarks <= 70) {
			System.out.println("Second class");
		} else {
			System.out.println("Fail");
		}
	}
}
/*
 * Use if to specify a block of code to be executed, if a specified condition is
 * true Use else to specify a block of code to be executed, if the same
 * condition is false Use else if to specify a new condition to test, if the
 * first condition is false Use switch to specify many alternative blocks of
 * code to be executed
 * 
 * /*Syntax
 * 
 * if (condition) { // block of code to be executed if the condition is true }
 * else { // block of code to be executed if the condition is false }
 */