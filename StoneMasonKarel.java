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
		moveDouble();
	
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
				turn();
			else
			putBeeper();
			turn();
}
	private void rotate(){
		if (frontIsBlocked());
		turnAround();
	};	
	
	private void turn(){
		
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
