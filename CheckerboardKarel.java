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
	public void run(){
		putBeeper();
		turnLeft();
		upwardPattern();
		rightTurn();
		downwardPattern();
		leftTurn();
		upwardPattern();
		rightTurn();
		downwardPattern();
		leftTurn();
	}
		
	private void upwardPattern(){
		while (frontIsClear()){
			if (beepersPresent()){
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
	}
	
	private void rightTurn(){
		turnRight();
		move();
		putBeeper();
		turnRight();
	}
	
	private void downwardPattern(){
		while (frontIsClear()){
			if (beepersPresent()){
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
	}
	
	private void leftTurn(){
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		
	}
}
