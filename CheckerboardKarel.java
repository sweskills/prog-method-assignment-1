/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		move();
		turnDouble();
		putBeeper();
		
		//
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		move();
	}
	

	// You fill in this part

	private void moveDouble() {
		move();
		move();
	}
	//
	private void turnDouble() {
		turnLeft();
		turnLeft();
	}
}
