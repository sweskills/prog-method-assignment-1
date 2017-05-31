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

	public void run(){
		faceEast();
		
	}
	private void faceEast(){
		if (facingEast()) {
			turnRight();
			turnRight();
			turnRight();
		}
		if (facingNorth()) {
			turnRight();
			turnRight();
		}
		if (facingSouth()) {
			turnRight();
		}
	}
	/*
	private void faceSouth(){
		if (facingNorth()) {
			
		}
		
	}
	
	private void faceWest() {
		if (facing)
	}
	
	private void fastRun {
		
	}
*/	
	}
	
	

