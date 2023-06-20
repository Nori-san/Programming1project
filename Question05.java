package TeamProject_PL1;

import java.util.Random;
import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, sz, majorNum;

		Scanner kb = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Please Input the size of array to creat  : ");
		sz = kb.nextInt();
		kb.close();

		int[] myarr1 = new int[sz];

		for (i = 0; i < myarr1.length; i++) {
			myarr1[i] = rand.nextInt(1,4);
		}

		System.out.println("============================ ");
		System.out.println("Printing the array ");
		System.out.println("============================ ");
		for (i = 0; i < myarr1.length; i++) {
			System.out.printf("%4d", myarr1[i]);
		}
		System.out.println();

		majorNum = majorElement(myarr1);  // Call the method to check the majority element
		System.out.println("==========================");
		System.out.println("Major num : " + majorNum);

	}

	public static int majorElement(int[] arr) {
		int i, j, majorNum = 0, numCnt = 1, temp = 0, dupCnt = 0;

		for (i = 0; i < arr.length; i++) {   // Element Count in array 
			temp = arr[i];
			for (j = i + 1; j < arr.length; j++) {
				if (i > 0 && arr[i] == arr[j]) {
					break;
				} else {
					if (arr[j] == temp) {
						numCnt++;
					} else {
						continue;
					}
				}
			}
			if (i > 0 && arr[i] == arr[i - 1]) { // Filtering duplicates to print out
				continue;
			} else {
				for (j = i; j >= 0; j--) {
					if (arr[j] == temp) {
						dupCnt++;
					} else {
						continue;
					}
				}
				if (dupCnt < 2) {
					System.out.println("number : " + temp);
					System.out.println("number count : " + numCnt);
					if (numCnt > arr.length / 2) {
						majorNum = temp;
					}
					numCnt = 1;
					dupCnt = 0;
				} else {
					dupCnt = 0;
					continue;
				}
			}
		}
		return majorNum;
	}

}
