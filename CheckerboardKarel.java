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

	// You fill in this part
	public void run() {
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleLeft();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleRight();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleLeft();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleRight();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleLeft();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleRight();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		turnDoubleLeft();
		
		if (beepersPresent()) {
			move();
		} else {
			putBeeper();
		}
		
		if (frontIsClear()) {
			dropBeeper();
		}
		
		move();
		turnRight();
		
		
		
		
		
		
	}
	
	private void moveDouble() {
		move();
		move();
	}
	
	private void turnDoubleLeft() {
		move();
		turnLeft();
		move();
		turnLeft();
	}
	
	private void dropBeeper() {
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
	}
	
	private void turnDoubleRight() {
		move();
		turnRight();
		move();
		turnRight();
	}
}

