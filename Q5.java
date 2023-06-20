package Programming1project;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array nums of size n, return the majority element. The majority
		// element is the element that appears more than [n / 2] times. You may assume
		// that the majority element always exists in the array.

		int i = 0, sz, majorNum;

		Scanner kb = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter? ");
		sz = kb.nextInt();

		int[] myarr1 = new int[sz];
		System.out.println("Please enter numbers :");
		do {
			myarr1[i++] = kb.nextInt();
		} while (i < myarr1.length);

		kb.close();
//		int[] myarr2 = { 2, 2, 1, 1, 1, 2, 2 };
		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		majorNum = majorElement(myarr1); // Call the method to check the majority element
		System.out.println("==========================");
		System.out.println("Major num : " + majorNum);

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

			if (dupCnt <= 1) {
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
