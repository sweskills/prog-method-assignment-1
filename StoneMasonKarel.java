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
	
		turnLeft();
		firstLoop();
		
		
		
	}
	
	private void firstLoop() {
		for (int i=0; i<4; i++) {
			move();
		}
		turnRight();
		for (int j=0; j<4; j++) {
			move();
			
		}
		turnRight();
		for (int k=0; k<4; k++) {
			move();
			
		}
		turnAround();
	}
}