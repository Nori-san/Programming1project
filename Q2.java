package Programming1project;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		You are commissioned to write a Java program that will asking from user integer number and call it joker, Then ask from user how many number he/she wants to put .
//		After getting all the number output will be as follow, 
//		If the number is less than joker give the zero otherwise deduct that number until getting number less than joker and keep that number. 

		Scanner input = new Scanner(System.in);
		System.out.print("Input Joker number: ");
		int joker = input.nextInt();
		System.out.print("Input size: ");
		int size = input.nextInt();
		
		int [] arrayNum = new int[size];
		
		for (int i = 0; i < size; i++) {
            System.out.print("Enter Number at index " + i + ": ");
            int num = input.nextInt();
		
            if (num > joker) {
            	arrayNum[i] -= joker;
            } else {
            	while ( num >= joker) {
            		num -= joker;
            	}
            	arrayNum[i]=num;
            }
		}
            
            System.out.println("Updated array:");
            for (int i = 0; i < size; i++) {
                System.out.print(arrayNum[i] + " ");
            }
            
		input.close();
		}
	}


	

