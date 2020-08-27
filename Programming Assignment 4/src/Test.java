
/* CPSC 50100 - Programming Fundamentals 
 * Bhavana Kota
 * Summer II 2020
 * Programming Assignment 4
 */
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.print("Programming Fundamentals\n" + "Name: Bhavana Kota\n" + "PROGRAMMING ASSIGNMENT 4 - SET\n");

		boolean Quit = false;
		Set set = new Set();

		while (Quit != true) {
			System.out.print("\nEnter command: ");
			Scanner scan = new Scanner(System.in);
			String value = scan.nextLine();
			String[] valueArr = value.split(" ");
			String command = valueArr[0];

			if (!command.equals("add") && !command.equals("del") && !command.equals("exists"))
				continue;

			int integer = 0;
			try {
				integer = Integer.parseInt(valueArr[1]);
			} catch (Exception e) {
				continue;
			}
			if (command.equals("add")) {
				set.add(integer);
				System.out.print(set.toString());
			}
			if (command.equals("del")) {
				set.del(integer);
				System.out.print(set.toString());
			}
			if (command.equals("exists"))
					System.out.print(set.exists(integer));
			}
		}
	}
