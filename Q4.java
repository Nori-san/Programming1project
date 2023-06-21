package Programming1project;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write the method to get the array and sort it. (Don’t use any library).
		
		int [] arrayNum = {9,6,4,2,3,5,7,0,1};
		
		System.out.println("Original Array " + Arrays.toString(arrayNum));
		sortArray(arrayNum);

	}
	public static void sortArray(int[] array) {
		int n = array.length;
		for (int i=0;i<n;i++) { 			//iterating the array
			for (int j=i+1;j<n;j++) {
				int temp =0;
				//sorting by swapping variables
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("SortedArray: " + Arrays.toString(array)); 
	}

}
