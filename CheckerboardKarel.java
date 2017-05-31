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
		moveOn();
		turnLeft();
		
	}

	private void moveOn(){
		for (int i = 0; i < 4; i++){
			if (frontIsClear()){
				jump();
				
			} 
			if (frontIsBlocked()){
				turnLeft();
			}
			while (frontIsBlocked()){
			}
			
		turnLeft();}
		}
	
	private void dropBeeper(){
		putBeeper();
		move();
		move();
	}
	private void jump(){
		dropBeeper();
		dropBeeper();
}
}
