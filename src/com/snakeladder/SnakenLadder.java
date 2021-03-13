package com.snakeladder;

public class SnakenLadder {
	private static final int WIN_POS = 100;
	private static final int NO_PLAY = 0;
	private static final int LADDER = 1;
	private static final int SNAKE = 2;

	static void myMethod() {
		int intposition = 0;
		System.out.println("Player at startposition: " + intposition);
		int rolldice = 1 + (int) ((Math.random() * 10) % 6);
		System.out.println("Player rolled dice: " + rolldice);
		int optionPlay = (int) ((Math.random() * 10) % 3);
		System.out.println("Player rolled dice: " + optionPlay);
		if (optionPlay == 0) {
			System.out.println("No play");
		}

		else if (optionPlay == 1) {
			System.out.println("ladder");
		}

		else if (optionPlay == 2) {
			System.out.println("snake");
		}

	}

	/*static void myMethod2() {
		int N = 0;
		int count = 0;
		do {
			count++;
			int rolldice = 1 + (int) ((Math.random() * 10) % 6);
			if (N + rolldice <= 100) {
				N = N + rolldice;
			} else {
				System.out.println("Could not move coin, you should get " + (100 - N) + " to win");
				continue;
			}
			System.out.println("Coin moved to " + N);
		} while (N != 100);
		System.out.println("Player has reached 100 after " + count + " throws");
		System.out.println("You won after " + count + " dice throws");
	}*/


	static void myMethod3() {
		int currPos = 0;
		while (currPos != WIN_POS) {
			int diceRoll = rollDice();
			// Option Check
			currPos = optionSelect(currPos, diceRoll);
			System.out.println("The current Position of the player is: " + currPos);
		}

	
	}
	public static int rollDice() {
		int throwDice = 1 + (int) ((Math.random() * 10) % 6);
		System.out.println("The Dice Rolled: " + throwDice);
		return throwDice;

	}

	public static int optionSelect(int currPos, int diceRoll) {
		int option = (int) ((Math.random() * 10) % 3);
		switch (option) {
		case NO_PLAY:
			System.out.println("The option was to no play, hence the player will not advance.");
			break;
		case LADDER:
			currPos += diceRoll;
			if (currPos > WIN_POS) {
				System.out.println("Since the current dice roll for Ladder will take the player out of " + WIN_POS
						+ " bound, hence the player will not move forward.");
				currPos -= diceRoll;
			} else
				System.out.println("The option came to Ladder, the player will move forward: " + diceRoll + " steps.");
			return currPos;

		case SNAKE:
			currPos -= diceRoll;
			if (currPos < 0) { // If current position goes below 0, reset
				System.out.println(
						"Since the current dice roll for snake will take player below 0, the player will move to start position.");
				currPos = 0;
			} else
				System.out.println("The option came to Snake, the player will move backward: " + diceRoll + " steps.");
			return currPos;

		default:
			System.out.println("Some error occured, default case");
			break;

		}
		return currPos;
	}

	public static void main(String[] args) {
		myMethod();
		// myMethod2();
		myMethod3();
	}
}
