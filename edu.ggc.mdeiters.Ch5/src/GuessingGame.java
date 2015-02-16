/**
 * ClassName: GuessingGame
 * @author Mike Deiters
 * 
 * This class plays a simple guessing game
 * Purpose: Demonstrate the while loop
 */
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 100);
		
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please guess number between 1 and 100");
		int guess = input.nextInt();
		
		while (guess != number){
			if (guess < number){
				System.out.println("Wrong. Guess higher next time");
				guess = input.nextInt();
			} else {
				System.out.println("Wrong. Guess lower next time");
				guess = input.nextInt();
			}
		}
		
		System.out.println("Your right!");

	}

}
