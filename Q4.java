package Programming1project;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Write the method to get the array and sort it. (Don’t use any library).

		int i;
		int[] arrayNum = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		System.out.print("Original Array : [");
		for (i = 0; i < arrayNum.length; i++) {
			System.out.printf("%3d", arrayNum[i]);
		}
		System.out.println("  ] ");
		System.out.println();

		sortArray(arrayNum);

	}

	public static void sortArray(int[] array) {
				//sorting by swapping variables

		int i, j;
		for (i = 0; i < array.length; i++) {
			for (j = i + 1; j < array.length; j++) {
				int temp = 0;
				// swapping variables
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}		
		System.out.print("Sorted Array : [");
		for (i = 0; i < array.length; i++) {
			System.out.printf("%3d", array[i]);
		}
		System.out.println("  ] ");
		System.out.println();
	}

}
