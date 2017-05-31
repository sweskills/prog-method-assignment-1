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
		/*start of main
		 * Karel drop beeper
		 */
		putBeeper();
		
		//Karel move in two steps and drop beeper and then move to another row
		beeperDropping();
		madeEasy();
		
		//Karel move in two steps and drop beeper and then move to another row
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnDoubleRight();
	}
		//end of public methods
		
		
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
