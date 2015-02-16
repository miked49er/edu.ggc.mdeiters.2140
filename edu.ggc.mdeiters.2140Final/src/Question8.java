/*
 * Write a complete program that reads an integer variable a and a double variable b from the user.
 * Then prints the variables to the console.
 * Be sure to prompt the user for the integer and double values (don't just read them in).
 */

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a;
		double b;
		
		System.out.print("Please input an interger: ");
		a=input.nextInt();
		
		System.out.print("Please input a double: ");
		b=input.nextDouble();
		
		System.out.println("The interger variable 'a' is "+a);
		System.out.println("The double variable 'b' is "+b);
	}

}
