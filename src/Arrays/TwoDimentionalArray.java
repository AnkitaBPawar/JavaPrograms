package Arrays;

import java.util.Arrays;

public class TwoDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 0th Array //1st Array
		int a[][] = { { 10, 20, 30, 40, 50 }, { 60, 70, 80, 90, 100 } };
		System.out.println(a.length);

		System.out.println(a[1][0]); // To access value

		System.out.println(a[0].length); // Length of array
		System.out.println(a[1].length);

		System.out.println(a[1][4] = 89);

		a[0][0] = 0;

		System.out.println(Arrays.toString(a[0]) + Arrays.toString(a[1]));

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}

		// Enhance for loop

		System.out.println("After Enhanced For loop");
		for (int[] b : a) {  // to get values in a
			for (int j : b) { //to print each value in a
				System.out.println(j);
			}

		}

		System.out.println("Only 1st array");
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(a[i][j]);
			}
		}
		System.out.println("Only 2nd array");
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i == 1) {
					System.out.println(a[i][j]);
				} else {
					break;
				}
			}

		}
	}

}
