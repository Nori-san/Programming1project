package Programming1project;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		You are commissioned to write a Java program that will asking from user integer number and call it joker, Then ask from user how many number he/she wants to put .
//		After getting all the number output will be as follow, 
//		If the number is less than joker give the zero otherwise deduct that number until getting number less than joker and keep that number. 

		Scanner input = new Scanner(System.in);
		//Jokers input
		System.out.print("Joker: ");
		int joker = input.nextInt();
		//Size of the array
		System.out.print("Number: ");
		int size = input.nextInt();
		
		int [] arrayNum = new int[size];
		
		//iterating the size of the array then input numbers corresponds to the index
		for (int i = 0; i < size; i++) {
            System.out.print("Enter Numbers:  ");
            int num = input.nextInt();
            	while ( num >= joker) { //Every number bigger than the joker
            		num -= joker;	
            	}
            	arrayNum[i]=num;
            }
		 System.out.println();
            for (int i = 0; i < size; i++) {
                System.out.print(arrayNum[i] + " ");
            }
		input.close();
		}
	}


	

