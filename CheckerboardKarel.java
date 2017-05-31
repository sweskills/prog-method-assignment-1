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
		if (frontIsClear() ) {
			moveDouble();
			putBeeper();
			}
		else {
			turnLeft();
		}
		
		//
		turnLeft();
		putBeeper();
		
		//
		while (frontIsClear() ) {
			moveDouble();
			putBeeper();
		}
		
		//
		turnLeft();
		putBeeper();
		
		//
		while (frontIsClear() ) {
			moveDouble();
			putBeeper();
		}
		
		//
		turnLeft();
		putBeeper();
	}
	

	// You fill in this part

	private void moveDouble() {
		move();
		move();
	}
}
