
public class Array {
	public static void main(String args[]) {
		int num1 = 3;
		// String[] arr = new String[3];
		int[] arr1 = new int[3];

		// int[] arr2 = {1,2,3};
		// String[] arr3 = {"1", "2", "3"};

		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;

		System.out.println("foreach loop");
		for (int num : arr1) {
			System.out.println(num);
		}

		System.out.println("for loop");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		int j = 0;

		System.out.println("while loop");
		while (j < 3) {
			System.out.println(arr1[j]);
			j++;
		}

		System.out.println("dowhile loop");
		j = 0;
		do {
			System.out.println(arr1[j]);
			j++;
		} while (j < 3);

	}
}
