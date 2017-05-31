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
		
		//
		beeperDropping();
		madeEasy();
		
		//
		
		beeperDropping();
		move();
		turnDoubleRight();
		
		//
		putBeeper();
		beeperDropping();
		
		//
		madeEasy();
	}
		//
		
		
	//start of private methods

	private void moveDouble() {
		move();
		move();
	}
	//
	private void turnDoubleLeft() {
		turnLeft();
		move();
		turnLeft();
	}
	//
	private void turnDoubleRight() {
		turnRight();
		move();
		turnRight();
	}
	//
	private void beeperDropping() {
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
	}
	//
	private void madeEasy() {
		move();
		turnDoubleLeft();
		putBeeper();
	}

	
	//
}
