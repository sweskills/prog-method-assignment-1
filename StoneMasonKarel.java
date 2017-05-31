/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

	public void run() {
	
		putBeeper();
		turnLeft();
		upDownLoop();
		//rightTurn();
		//allLoop();
		//turnRight();
	}
	private void rightTurn() {
		
		for (int j=0; j<4; j++) {
			move();
		}
		
	}
	private void upDownLoop() {
		while (frontIsClear()) {
			move();
			fixBeeper();
		}
	}
		turnAround();
		while (frontIsClear()){
			move();
		}
		/*
		turnRight();
		while (frontIsClear()) {
			move();
			fixBeeper();
		}
		turnAround();
	}*/
	
	private void fixBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}
}