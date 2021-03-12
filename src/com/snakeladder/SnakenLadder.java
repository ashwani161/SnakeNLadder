package com.snakeladder;

public class SnakenLadder {
	static void myMethod() {
		int intposition = 0;
		System.out.println("Player at startposition: " + intposition);
		int rolldice = 1+ (int)( (Math.random() *10) % 6);
		System.out.println("Player rolled dice: " +rolldice);
		
	}
	public static void main(String[] args) {
		myMethod();
	}
}
