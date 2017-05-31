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
		while (frontIsClear() ) {
		if (noBeepersPresent() ){
			putBeeper();
		}
		move();
		}
		
		//
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		//
		turnLeft();
		moveDoubleDouble();
		turnLeft();
		while (frontIsClear() ) {
			if (noBeepersPresent() ){
				putBeeper();
			}
			move();
			}
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		turnLeft();
	
	}
	
	//
	private void moveDouble() {
		move();
		move();
	}
	
	//
	private void moveDoubleDouble() {
		moveDouble();
		moveDouble();
	}
}