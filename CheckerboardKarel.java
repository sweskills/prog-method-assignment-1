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
		jump();
		dropBeeper();
		putBeeper();
		move();
		turnLeft();
		move();
		turnLeft();
		jump();
		putBeeper();
		move();
		putBeeper();
	
		
	}

	private void moveOn(){
		
		}
	
	private void dropBeeper(){
		putBeeper();
		move();
		move();
		putBeeper();
		move();
	}
	private void jump(){
		dropBeeper();
		dropBeeper();
		while (frontIsBlocked()){
			turnLeft();
		}
}
}
