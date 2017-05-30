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
		for (int i = 0; i < 8; i++) {
			if (frontIsClear()) {
				move();
			} else {
				turnLeft();
				move();
				turnLeft();
			}
		}
		
		for (int i = 0; i < 8; i++) {
			if (frontIsClear()) {
				move();
			} else {
				turnRight();
				move();
				turnRight();
			}

	}
	private void createBeeperCheckerboardLine() {
		while (frontIsClear()) {
			move();
			putBeeper();
		}
	}
	
}
