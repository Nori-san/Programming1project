package Programming1project;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		You are commissioned to write a Java program that will asking from user 2  integer. Call them row and col. Create the multidimensional array by that sizes. 
//
//		Fill the array with the random number between 1 to 100. And print it. 
//		Now ask user which number want to disappear. Get the value and search for entire the matrix ; find the number and make it to zero and return the new array

		
		Scanner input = new Scanner(System.in);
		System.out.print("Input Row size: ");
		int row = input.nextInt();
		System.out.print("Input Column size: ");
		int col = input.nextInt();
		
		multidimensionalArray(row, col);
		
		System.out.print("Input number to remove: ");
		int num = input.nextInt();
		
		
		
	
	} 
	
	public static void multidimensionalArray(int row, int col) {
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
			
		}
	
	public static int[] removeElementIndex(int[] array, int specificValue) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == specificValue) {
				count++;
			}
		}
		int[] removeIndex = new int[array.length - count];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != specificValue) {
				removeIndex[index] = array[i];
				index++;
			}
		}
		return removeIndex;
	}
	}