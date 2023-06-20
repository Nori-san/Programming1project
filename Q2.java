package Programming1project;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		You are commissioned to write a Java program that will asking from user integer number and call it joker, 
//		Then ask from user how many number he/she wants to put . After getting all the number output will be as follow, 
//		If the number is less than joker give the zero otherwise deduct that number until getting number less than joker 
//		and keep that number.  

		int i = 0, joker, size;
		Scanner input = new Scanner(System.in);
		// Jokers input
		System.out.print("Joker: ");
		joker = input.nextInt();
		// Size of the array
		System.out.print("Number: ");
		size = input.nextInt();

		int[] arrayNum = new int[size];
		System.out.print("Enter Numbers:  ");
		System.out.println();
		do {	
			arrayNum[i++] = input.nextInt();  // getting input from user N-times according to the "size"
		} while (i < arrayNum.length);
		System.out.println();
		jokerCheck(arrayNum, joker);

		input.close();
	}

	public static void jokerCheck(int[] arr, int joker) {
		int i;

		for (i = 0; i < arr.length; i++) {  // compare with joker
			while (arr[i] >= joker) {		// until joker <= value , repeat the subtraction
				arr[i] -= joker;
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}
