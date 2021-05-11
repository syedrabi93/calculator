
package calculator;

import java.util.Scanner;

public class calculator {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		double num1, num2;

		System.out.println("Enter first number");
		num1 = sc.nextDouble();
		System.out.println("Enter second number");
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);
		
		double o = 0;
		
		switch (op) {
		
		case '+':
			o = num1 + num2;
			break;
		case '-':
			o = num1 - num2;
			break;
		case '*':
			o = num1 * num2;
			break;
		case '/':
			o = num1 / num2;
			break;

		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		System.out.println(num1 + " " + op + " " + num2 + " = " + o);
	}

}

