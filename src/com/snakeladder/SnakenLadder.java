package com.snakeladder;

public class SnakenLadder {
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

	static void myMethod2() {
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
	}

	public static void main(String[] args) {
		myMethod();
		myMethod2();
	}
}
