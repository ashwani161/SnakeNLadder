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

	public static void main(String[] args) {
		myMethod();
	}
}
