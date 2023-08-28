package Week1.Week1;
/*Name: Ronald M. Britos
 * Professor: Brother Light 
 * 9/14/2022
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class lab1i {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String Answer;
		int num;
		boolean valid = false;
		boolean stopadding = false;
		ArrayList<Integer> SumNumbers = new ArrayList<Integer>();
		ArrayList<Integer> Largest = new ArrayList<Integer>();
		do {

			System.out.println("In this program, you will enter a list of numbers");
			System.out.println("");

			do {
				do {
					System.out.print("Please enter a number (or hit the <Enter> key to stop): ");

					Answer = in.nextLine();
					try {
						// convert the user's input into an int
						// add the int to the array
						num = Integer.parseInt(Answer);
						SumNumbers.add(num);
						Largest.add(num);
					} catch (Exception e) {
						if (Answer.equals("")) {
							// break the while loop since you are not adding more numbers
							stopadding = true;
							valid = true;
						} else {
							System.out.printf("Invalid response. '%S' is not a number.", Answer);
							System.out.println("");
						}
						
					}

				} while (!stopadding);

			} while (!valid);

		} while (!valid);
		System.out.println("");
		// Printing the answers
		System.out.println("The total of the list of numbers is: " + addNumbers(SumNumbers));
		System.out.println("");
		System.out.println("The biggest number in the list is:" + largestNumber(Largest));

	}

	public static int addNumbers(ArrayList<Integer> SumNumbers) {
		int sum = 0;
		
        //For loop to add and sum the number from the array
		for (int i = 0; i < SumNumbers.size(); i++) {
			sum += SumNumbers.get(i);

		}

		return sum;

	}

	public static int largestNumber(ArrayList<Integer> Largest) {
		int grande = 0;
       // COllection is going to sort everything and put in order
		Collections.sort(Largest);
		// This is going to get the last number of the Array.
		grande = Largest.get(Largest.size() - 1);

		// THere is a If statement that we can use
		/*
		 * for (int i = 0; i < Largest.size(); i ++) {
		 * 
		 * 
		 * if( Largest.get(i) > grande) { grande = Largest.get(i); }
		 * 
		 * 
		 * 
		 * 
		 * }
		 */

		return grande;
	}
}
