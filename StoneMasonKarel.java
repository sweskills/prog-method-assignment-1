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

	// You fill in this part
	public void run(){
		turnLeft();
		moveOn();
		moveOn();
		moveOn();
		move();
	    turnRight();
		moveFour();
		turnRight();
		moveOn();
		move();
		turnRight();
		moveFour();
		
		
		move();
		putBeeper();
		
	}

	private void moveOn(){
		if (beepersPresent()){
			move();
			
		
		}
		if (frontIsClear() && !beepersPresent()){
			putBeeper();
			move();
		}
			else if (frontIsClear() && beepersPresent())
				move();
			else if (frontIsBlocked() && beepersPresent())
				move();
			else
			putBeeper();
}
	
	
	private void rotate(){
		
		while(frontIsBlocked());
		turnRight();
		
		
	}
	
	private void moveDouble(){
		move();
		move();
	}
	private void moveFour(){
		moveDouble();
		moveDouble();
	}
}
