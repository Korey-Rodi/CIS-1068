// Korey Rodi
// 9/22/25
// Assignment 4 - Game

// The purpose of this game is to replicate a nordic game called odmatt


import java.util.Scanner;
import java.util.Random;

public class Game {

	public static final int BJORKSTA = 0;
	public static final int FJALLBO = 1;
	public static final int SODERHAMN = 2;
	public static final int REVSKAR = 3;
	public static final int OXBERG = 4;

	public static void main(String[] args) {
		
		int computerWins = 0;
		int userWins = 0;
		int roundsPlayed = 0;
		
		printRules();
		
		Scanner console = new Scanner(System.in);
		System.out.println("\nPlay a round? \'Y' or \'N': ");
		String playRound = console.next();
		if (playRound.equalsIgnoreCase("y")) {
			roundsPlayed++;
		    System.out.println("Playing Game");
		    userMove(userWins, computerWins, roundsPlayed);
		} else {
		    System.out.println("Ending Game");
		    printFinalScores(userWins, computerWins, roundsPlayed);
		}
		console.close();
	}
		public static void printRules() {
			System.out.println("Rules:");
			System.out.println("\nFjallbo beats Soderhamn, Revskar\n"
					+ "Soderhamn beats Bjorksta, Oxberg\n"
					+ "Bjorksta beats Fjallbo, Revskar\n"
					+ "Revskar Beats Oxberg, Soderhamn\n"
					+ "Oxberg beats Fjallbo, Bjorksta");
		}
		public static void userMove(int userWins, int computerWins, int roundsPlayed) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter your Move: ");
			String userInput = console.next();
			while (!userInput.equalsIgnoreCase("BJORKSTA") &&
			           !userInput.equalsIgnoreCase("FJALLBO") &&
			           !userInput.equalsIgnoreCase("SODERHAMN") &&
			           !userInput.equalsIgnoreCase("REVSKAR") &&
			           !userInput.equalsIgnoreCase("OXBERG")) {

			        System.out.println("Invalid choice, try again.");
			        System.out.println("Enter your Move: ");
			        userInput = console.next();
			}

			            System.out.println("Your Move Is: " + userInput);
			            int computerMove = generateComputerMove();
			            int convertedUserMove = convertUserMove(userInput);
			            determineWinner(convertedUserMove,computerMove,userWins,computerWins,roundsPlayed);
			       console.close();
		}
		public static int generateComputerMove() {
			Random randomGenerator = new Random();
			int randomNumber = randomGenerator.nextInt(0,5);
			if (randomNumber == BJORKSTA) {
				System.out.println("Computers Move: Bjorksta");
				return 0;
			} else if (randomNumber == FJALLBO) {
				System.out.println("Computers Move: Fjallbo");
				return 1;
			} else if (randomNumber == SODERHAMN) {
				System.out.println("Computers Move: Soderhamn");
				return 2;
			} else if (randomNumber == REVSKAR) {
				System.out.println("Computers Move: Revskar");
				return 3;
			}
			else {
				System.out.println("Computers Move: Oxberg");
				return 4;
			}
		}
		public static int convertUserMove(String userInput) {
			if (userInput.equalsIgnoreCase("BJORKSTA")) {
				return BJORKSTA;
			} else if (userInput.equalsIgnoreCase("FJALLBO")) {
				return FJALLBO;
			} else if (userInput.equalsIgnoreCase("SODERHAMN")) {
				return SODERHAMN;
			} else if  (userInput.equalsIgnoreCase("REVSKAR")) {
				return REVSKAR;
			} else {
				return OXBERG;
			}
		}
		public static void determineWinner(int convertedUserMove,int computerMove, int userWins, int computerWins, int roundsPlayed) {
			if (convertedUserMove == computerMove) {
				System.out.println("\nComputer Wins");
				computerWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else if (convertedUserMove == 0 && (computerMove == 1 || computerMove == 3)) {
				System.out.println("\nUser Wins");
				userWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else if (convertedUserMove == 1 && (computerMove == 2 || computerMove == 3)){
				System.out.println("\nUser Wins");
				userWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else if (convertedUserMove == 2 && (computerMove == 0 || computerMove == 4)) {
				System.out.println("\nUser Wins");
				userWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else if (convertedUserMove == 3 && (computerMove == 2 || computerMove == 4)) {
				System.out.println("\nUser Wins");
				userWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else if (convertedUserMove == 4 && (computerMove == 0 || computerMove == 1)) {
				System.out.println("\nUser Wins");
				userWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			} else {
				System.out.println("\nComputer Wins");
				computerWins++;
				askToContinue(userWins, computerWins, roundsPlayed);
			}
			
		}
		public static void askToContinue(int userWins, int computerWins, int roundsPlayed) {
			Scanner console = new Scanner(System.in);
			System.out.println("\nPlay again? \'Y' or \'N': ");
			String playAgain = console.next();
			if (playAgain.equalsIgnoreCase("y")) {
				roundsPlayed++;
			    System.out.println("Playing Game");
			    userMove(userWins, computerWins, roundsPlayed);
			} else {
			    System.out.println("Ending Game");
			    printFinalScores(userWins, computerWins, roundsPlayed);
			}
			console.close();
			
			
		}
		public static void printFinalScores(int userWins,int computerWins,int roundsPlayed) {
			System.out.println("\nRounds Played: " + roundsPlayed);
			System.out.println("User Wins: " + userWins);
			System.out.println("Computer Wins: " + computerWins);
		}

}
