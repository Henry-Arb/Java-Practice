package com.henryarb.game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
//		Show a welcome message.
		System.out.println("Welcome to the Number Guessing Game!");
//		Ask the user's name and say hello to the user.
		System.out.println("Please enter your name:");
		String name = scanner.next();
		System.out.println("Hello, "+name);
//		Ask if we should start the game, after receiving a positive answer, start the game.
		System.out.println("Would you like to start the game? y/n");
		String choice = scanner.next();
		if(choice.toLowerCase().trim().equals("y")){
			Random random = new Random();
			int randNum = random.nextInt(0,10);
			int guess = 1;
			int guessNum = -1;
			System.out.println("Guess a number from 0 to 10: ");
			while(randNum != guessNum && guess <= 5){
				guessNum = scanner.nextInt();
				if(guessNum == randNum){
					System.out.println("Congratulations! You guessed the random number!");
					break;
				}
				else if(guessNum < randNum){
					System.out.println("Your guess was too low! You have " + (5-guess) + " chances left");
				}
				else{
					System.out.println("Your guess was too high! You have " + (5-guess) + " chances left");
				}
				guess++;
			}
			if(guessNum != randNum && guess >= 5){
				System.out.println("The random number was: "+randNum);
				System.out.println("Game Over! Better luck next time!");
			}
		}
		else{
			System.out.println("We hope to see you next time!");
		}
	}
}
