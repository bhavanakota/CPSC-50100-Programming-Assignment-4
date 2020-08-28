/* CPSC 50100 - Programming Fundamentals 
 * Bhavana Kota
 * Summer II 2020
 * Programming Assignment 4
 */

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// Printing title
		System.out.print("Programming Fundamentals\n" + "Name: Bhavana Kota\n" + "PROGRAMMING ASSIGNMENT 4 - SET\n");

		boolean Quit = false;
		Set set = new Set();

		// This continuously prints out the "Enter command:" line to enter a value
		while (Quit != true) {
			System.out.print("\nEnter command: ");
			Scanner scan = new Scanner(System.in);
			// Creating strings to hold the values and split arrays
			String value = scan.nextLine();
			String[] valueArr = value.split(" ");
			String command = valueArr[0];

			// This whole try/catch will scan each command entered and determine the proper
			// steps
			try {

				int integer = 0;

				// This will parse the values entered and determine the next step
				try {
					integer = Integer.parseInt(valueArr[1]);
				} catch (Exception e) {
					continue;
				}

				if (!command.equals("add") && !command.equals("del") && !command.equals("exists"))
					continue;

				switch (command) {

				// Add the value to the string
				case "add":
					set.add(integer);
					System.out.print(set.toString());
					break;

				// Delete the value if del is entered
				case "del":
					set.del(integer);
					System.out.print(set.toString());
					break;

				// Check to see if the value exists in the string
				case "exists":
					System.out.print(set.exists(integer));
					break;
				}
				// The catch statement to print
			} catch (Exception e) {
				System.out.print("Please enter an integer. Format: command integer");

			}
		}
	}
}
