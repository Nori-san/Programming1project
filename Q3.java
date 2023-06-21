package Programming1project;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		You are commissioned to write a Java program that will asking from user 2  integer. Call them row and col. 
//		Create the multidimensional array by that sizes. 
//
//		Fill the array with the random number between 1 to 100. And print it. 
//		Now ask user which number want to disappear. Get the value and search for entire the matrix ; 
//		find the number and make it to zero and return the new array

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Row size: ");
		int row = input.nextInt();
		System.out.print("Input Column size: ");
		int col = input.nextInt();
		
		System.out.println("Original Random table:");
		int[][] multArray = new int[row][col]; //[row][col]
		for (int i = 0; i < row; i++) {  //i is the row of the table
			for (int j = 0; j < col; j++) { //j is the column of the table
				multArray[i][j] = (int) (Math.random() * 100 +1); //generating random number from 1-100
				}
			}
			for (int i = 0; i < row; i++) { //iterating the multidimensional array
				for (int j = 0; j < col; j++) {
					System.out.printf("%4d", multArray[i][j]);
				} 
				System.out.println();
			}
			System.out.println();
		System.out.print("Input number to remove: "); //Removing number in the multArray
		int num = input.nextInt();
		for (int i = 0; i < row; i++) {  
			for (int j = 0; j < col; j++) { 
				if (multArray[i][j] == num) { //removing the specific number in the table
					multArray[i][j] = 0; //replacing removed number to 0
				}
			}
		}
		System.out.println("\nUpdated Random Table:");
		for (int i = 0; i < row; i++) {  //iterating table and print an updated table
			for (int j = 0; j < col; j++) { 
				System.out.printf("%4d", multArray[i][j]);
			}
			System.out.println();
		}
		input.close();
	}
}