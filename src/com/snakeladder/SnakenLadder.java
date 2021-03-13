package com.snakeladder;

public class SnakenLadder {
	public static final int WIN_POSITION = 100;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static int[] player2 = {0, 0};
	public static int[] player1 = {0, 0};
	static int play = 1;

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

	static void myMethod3() {
		int currPos = 0;
		while (currPos != WIN_POSITION) {
			int diceRoll = rollDice();
			// Option Check
			currPos = option(currPos, diceRoll);
			System.out.println("The current Position of the player is: " + currPos);
		}

	
	}
	public static int rollDice() {
		int throwDice = 1 + (int) ((Math.random() * 10) % 6);
		System.out.println("The Roll Dice: " + throwDice);
		return throwDice;

	}

	public static int option(int currPos, int diceRoll) {
		int option = (int) ((Math.random() * 10) % 3);
		switch (option) {
		case NO_PLAY:
			System.out.println("The option is no play, player will not continue.");
			break;
		case LADDER:
			currPos += diceRoll;
			if (currPos > WIN_POSITION) {
				System.out.println("Current die will make player out of the game" + WIN_POSITION
						+ " bound, hence the player will not continue");
				currPos -= diceRoll;
			} else
				System.out.println("The option came to Ladder, the player will move forward: " + diceRoll + " steps.");
			return currPos;

		case SNAKE:
			currPos -= diceRoll;
			if (currPos < 0) { 
				System.out.println(
						"Current die for snake will move under the player to 0, the player will move to start position.");
				currPos = 0;
			} else
				System.out.println("The option came to Snake, the player will move backward: " + diceRoll + " steps.");
			return currPos;

		default:
			System.out.println("Default case");
			break;

			
		}
		return currPos;
	}
	static void myMethod4() {
			while(player1[1] != WIN_POSITION && player2[1] != WIN_POSITION) {
				if(play == 1){
					System.out.println("\nPlayer 1 will have a play.");
					player1 = turn(player1, play);
					System.out.println("Player 1 position is at the end of the play is " + player1[1]);
				}else {
					System.out.println("\nPlayer 2 will have a play.");
					player2 = turn(player2, play);
	                                System.out.println("Player 2 position is at the end of the play is " + player2[1]);
				}
			}

			if(player1[1] > player2[1]){
				System.out.println("Player 1 wins in " + player1[0] + " moves.");
			}else
				System.out.println("Player 2 wins in " + player2[0] + " moves.");
		}
	public static int[] turn(int[] player, int play) {

		player[0]++;

		int dice = diceRoll();
		System.out.println("The Dice Rolled for " + dice);
		int opt = optionSelect();
		switch(opt) {
			case NO_PLAY:
				System.out.println("Option for No Play");
				switchPlayer();
				System.out.println("Current position of player " + play + " is " + player[1]);
				return player;

			case LADDER:
				System.out.println("Option for Ladder, player " + play + " will play again");
				player[1] += dice;
				if(player[1] > WIN_POSITION) {
					System.out.println("Move exceed above game boundaries");
					player[1] -= dice;
                                }
				System.out.println("Current position of player " + play + " is " + player[1]);
				player = turn(player, play);
				break;

			case SNAKE:
				System.out.println("Option for Snake");
				player[1] -= dice;
				if(player[1] < 0) {
					System.out.println("Move falls below game boundaries will start from 0");
					player[1] = 0;
				}
				switchPlayer();
                                System.out.println("Current position of player " + play + " is " + player[1]);
				return player;
		}
		return player;
	}public static void switchPlayer() {
		if(play == 1) {
			play = 2;
		} else
			play = 1;
	}

	public static int diceRoll() {
		return (int)(((Math.random() * 10) % 6) + 1);
	}

	public static int optionSelect() {
        	return (int) ((Math.random() * 10) % 3);
	}
	public static void main(String[] args) {
		myMethod();
		//myMethod3();
		myMethod4();
	}
}
