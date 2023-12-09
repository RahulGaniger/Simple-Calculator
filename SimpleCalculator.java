package com.project;
import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
//		to get user inputs
		Scanner scanner = new Scanner(System.in);

		System.out.println("This is a Simple Calculator");
		

		System.out.print(" Enter the number 1: ");
		int num1 = scanner.nextInt();

		System.out.print(" Enter the number 2: ");
		int num2 = scanner.nextInt();

		System.out.println("Select operation:");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");

		System.out.print("Enter your choice (1-4): ");
		int choice = scanner.nextInt();

		int result = 0;

		switch (choice) {
		case 1:
			result = num1 + num2;     
			System.out.println("Result: " + result);
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Result: " + result);
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Result: " + result);
			break;
		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Result: " + result);
			} else {
				System.out.println("Cannot divide by zero.");
			}
			break;
		default:
			System.out.println("Invalid choice. Please enter a number between 1 and 4.");
		}

		scanner.close();
	}
}



