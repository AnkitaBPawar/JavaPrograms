package ImpPrograms;

public class AscendingOrder {

	public static void main(String[] args) {
		int[] arr = { 44, 77, 22, 88, 55 };
		int temp = 0;
		// 44 77 22 88 55
		// a[i] < a[j]
		// temp=a[i]
		// a[i]=a[j]
		// a[j]=temp

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
			System.out.print(arr[i] + " ");
		}

	}

}
