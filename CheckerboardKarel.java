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
		checkWall();
		
		
	}
	
	private void checkWall() {
		
		if (frontIsBlocked()) {
			turnLeft();
			while (frontIsClear()) {
				move();
				if (frontIsClear()) {
					move();
					putBeeper();
				}
			}
		}
	}
	
	private void myEastBeepers(){
		
		
	}
	
	private void myWestBeepers(){
		
		
	}


}



	

