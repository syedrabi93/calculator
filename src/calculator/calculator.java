
package calculator;

import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;

public class calculator {

	//static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		 Scanner commandLineArgs = new Scanner(System.in);
		  Calculation c = new Calculation ();
		  // todo: parse command line parameters to determine
		  // operation and operands
		  // good design pattern:
		  // let's make a operations manager class to control
		  // the flow of execution according to the operation the user specified.
		  //c.add(2, 2);
		  
		  //System.out.println("fini");
		  
		  
		  double num1, num2, result;

			System.out.println("Enter first number");
			num1 = commandLineArgs.nextDouble();
			System.out.println("Enter second number");
			num2 = commandLineArgs.nextDouble();

			System.out.println("Enter the operator (+,-,*,/)");

			char op = commandLineArgs.next().charAt(0);
			result = 0;
			switch (op) {
			
			case '+':
				result = c.add(num1,num2);
				break;
			case '-':
				result = c.subtract(num1,num2);
				break;
			case '*':
				result = c.multiply(num1,num2);
				break;
			case '/':
				result = c.divide(num1,num2);
				break;

			default:

				System.out.println("You enter wrong input");

				break;
			}
			
			System.out.println("The final result:");

			System.out.println();

			System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	  }
}
