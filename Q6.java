package Programming1project;

import java.util.Arrays;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
		
		int [] arrayNum = {9,6,4,2,3,5,7,0,1};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		int missingNumber = findMissingNumber(arrayNum);
		System.out.println("The missing number is: " + missingNumber);

	}
	
	public static int findMissingNumber(int[] array) {
		int n = array.length; 
		//formula to find missing number in a sequence of array (n+1)/2
		int sum = (n * (n + 1)) / 2;
		int actualSum = 0;
		for (int i = 0; i < n; i++) {
			actualSum += array[i];
		}

		return sum - actualSum;
	}
}
