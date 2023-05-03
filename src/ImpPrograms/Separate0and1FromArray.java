package ImpPrograms;

import java.util.Arrays;

public class Separate0and1FromArray {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 0, 2, 2, 1, 1, 0, 0, 2, 2 };

		int count = 0;
		int count1 = 0;

		// count of 0's
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			} else if (a[i] == 1) {
				count1++;
			}
		}

		System.out.println(count);
		System.out.println(count1);

		for (int i = 0; i < count; i++) {
			a[i] = 0;// {0,0,0,0}
		}

		for (int i = count1; i < (count+count1); i++) {
			a[i] = 1;// {1,1,1,1}
		}
		// {0,0,0,0,1,1,1,1,2,2,2,2}
		for (int i = (count + count1) ; i < a.length; i++) {
			a[i] = 2;
		}
		System.out.println(Arrays.toString(a));
	}

}
