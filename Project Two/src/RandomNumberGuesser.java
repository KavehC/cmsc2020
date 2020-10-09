/*
 * Owner: Kaveh Charkhabi
 * This Project has the program/ computer to select a number between 1 and 100 and change the upper and lower limits as the player tries to guess the correct 
 * number
 */ 
import java.util.Scanner;

public class RandomNumberGuesser {
	
	private static int nextGuess = 0;
	private static int randNum = 0;
	private static int lowGuess;
	private static int highGuess;
	private static int counter;
	private static String ans = "";
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean play = true, checkOne = false;
		//Displays header
		System.out.println("======= Random Number Guessing Game ========");
		//Game loop
		while(play) {
			lowGuess = 0;
			highGuess = 100;
			counter = 0;
			//Computer sets a random number
			randNum = RNG.rand();
			System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
			
			playersAnswer();
			//Runs players guesses through a check process to compare it to the computers randomly selected value till the user gets the same number
			playersGuess();
			
			System.out.println("try again? (yes or no)");
			ans = scan.nextLine();
			ans = ans.replaceAll("\\s", "");
			
			while(!ans.equalsIgnoreCase("no") && !ans.equalsIgnoreCase("yes")) {
				System.out.println("Please enter yes or no");
				ans = scan.nextLine();
				ans = ans.replaceAll("\\s", "");
			}
			
			if(ans.equalsIgnoreCase("no"))
				play = false;
		}
		System.out.println("Thank you for playing random number guessing game by Kaveh Charkhabi");
	}
	/*
	 * gets the users answer and check to see if user entered only numbers and saves that number to an int variable by checking it as a string and turning 
	 * it into an int to be checked later on int the code
	 */
	public static void playersAnswer() {
		ans = scan.nextLine();
		ans = ans.replaceAll("[^\\d]", "");
		nextGuess = Integer.parseInt(ans);
	}

	public static void playersGuess() {
		//Keeps the player guessing till they get the right number
		while(nextGuess != randNum) {
			//Checks to make sure the user is guessing with in the bounds of the low and high guess limits that change depending on the users guesses
			while(!RNG.inputValidation(nextGuess, lowGuess, highGuess))
				playersAnswer();
				
			//This if and the next check to see if the user is above or below the computers randomly selected number
			if(nextGuess < randNum) {
				counter++;
				System.out.println("Number of guesses is " + counter);
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				playersAnswer();
			}if(nextGuess > randNum) {
				counter++;
				System.out.println("Number of guesses is " + counter);
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess + " and " + highGuess);
				playersAnswer();
			}
		}
		counter++;
		System.out.println("Number of guesses is " + counter);
		System.out.println("Congradulations, you guessed correctly");
	}
}
