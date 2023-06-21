
package Programming1project;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array nums of size n, return the majority element. The majority
		// element is the element that appears more than [n / 2] times. You may assume
		// that the majority element always exists in the array.

		int i, majorNum;
		int[] myarr1 = { 2, 2, 1, 1, 1, 2, 2 };

		System.out.println("Printing the array ");
		System.out.print("[");
		
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%3d" , myarr1[i]);
		}
		System.out.println("  ]");
		System.out.println();

		majorNum = majorElement(myarr1); // Call the method to check the majority element
		System.out.println("==========================");
		System.out.println("Major num : " + majorNum );

	}

	public static int majorElement(int[] arr) {
		int i, j, majorNum = 0, numCnt = 1, temp = 0, dupCnt = 0;

		for (i = 0; i < arr.length; i++) { // count the number of element
			temp = arr[i];
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					numCnt++;
				} else {
					continue;
				}
			}

			for (j = i; j >= 0; j--) { // filtering duplicate of element
				if (arr[j] == temp) {
					dupCnt++;
				} else {
					continue;
				}
			}

			if (dupCnt <= 1) {		//Number of appearance in the array
				System.out.println(arr[i] + " is counted " + numCnt + " time(s).");
			}

			if (dupCnt > arr.length / 2) {		
				majorNum = temp;
			}

			numCnt = 1;
			dupCnt = 0;
		}

		return majorNum;
	}

}