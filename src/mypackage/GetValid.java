package mypackage;

import java.util.Scanner;

public class GetValid {
	

	public static int getValidInt(String validint, String validin2) {
		Scanner in = new Scanner(System.in);
		String input;
		int intNum = 0;
		boolean valid = false;
		while (!valid) {
			System.out.print(validint);
			input = in.nextLine();

			try {
				intNum = Integer.parseInt(input);

				valid = true;
			}

			catch (Exception e) {
				System.out.println(validin2);

			}
		}

		return intNum;
	}

	public static double getValidDouble(String string, String string2) {
		Scanner in = new Scanner(System.in);
		String input;
		double doubleNum = 0;
		boolean valid = false;
		while (!valid) {
			System.out.print(string);
			input = in.nextLine();

			try {
				doubleNum = Double.parseDouble(input);

				valid = true;
			}

			catch (Exception e) {
				System.out.println(string2);

			}
		}
		return doubleNum;

	}

	public static String getValidYN(String string, String string2) {
		Scanner in = new Scanner(System.in);
		Boolean valid = false;
		String answer;

		do {
			System.out.print(string);
			answer = in.nextLine();

			if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("Y")) {
				valid = true;
			} else {
				System.out.println(string2);
				valid = false;
			}
		} while (!valid);
		if (answer.equalsIgnoreCase("N")) {
			valid = true;

		} else {
			valid = false;
		}
		return answer;
	}

}
