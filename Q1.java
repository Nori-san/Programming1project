package Programming1project;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Today you are commissioned to write a Java program that will prompt for and
		// read 3 2-digit integers (named n1, n2 and n3 in this document) entered by the
		// user, and based on their sum will generate a magic number. Be sure to use the
		// same format and wording as in the sample runs in the table below.

		int i = 0;
		int[] myarr = new int[3];
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 3 2-digit numbers: ");
		do {
			myarr[i++] = kb.nextInt();
		} while (i < 3);

		kb.close();

		combiNum(myarr);
	}



	public static void combiNum(int[] arr) {
		int i, temp = 0, sum = 0;

		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		if (sum % 3 == 0) {
			if (sum % 5 != 0) {
				temp = (arr[1] / 10) * 100 + arr[0] + arr[2];  // Condition #1
			} else { // Condition #3
				temp = (arr[1] * 10) + (arr[0] % 10);
			}
		} else if (sum % 5 == 0) { // Condition #2
			temp = (arr[0] + arr[2]) * 10 + (arr[1] % 10);
		} else {	// Condition #4
			temp = arr[0] * 10000 + arr[1] * 100 + arr[2];
		}
		
		System.out.println("Your magic number is " + temp);
	}
}
