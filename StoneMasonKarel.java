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
		/*to drop start state beeper
		 * and kick start the project 
		 */
		if (noBeepersPresent() ) {
			putBeeper();
		}
		
		//
		turnLeft();
		while (frontIsClear() )	{
			if (noBeepersPresent() ) {
				putBeeper();
			}
			move();
		}
		
		//
		turnRight();
		moveDoubleDouble();
		turnRight();
		facingSouth();
		while (frontIsClear() )	{
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		turnAround();
		while (frontIsClear() )	{
			if (noBeepersPresent() ) {
				putBeeper();
			}
			move();
		}
		turnAround();
		facingSouth();
		while (frontIsClear() )	{
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}

		//
		turnLeft();
		moveDoubleDouble();
		turnLeft();
		while (frontIsClear() )	{
			if (noBeepersPresent() ) {
				putBeeper();
			}
			move();
		}
		
		//
		turnRight();
		moveDoubleDouble();
		turnRight();
		facingSouth();
		while (frontIsClear() )	{
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		turnLeft();
		
	}
	
	//start of private methods
	private void moveDouble() {
		move();
		move();
	}
	
	//to declare move double double
	private void moveDoubleDouble() {
		moveDouble();
		moveDouble();
	}
}