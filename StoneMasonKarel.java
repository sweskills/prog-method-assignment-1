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
				
		//to move while front is clear and drop beeper
		while (frontIsClear() ) {
			move();
			if (noBeepersPresent() ){
				putBeeper();
			}
		}
		
		//to face north, move and drop beeper
		turnLeft();
		facingNorth();
		while (frontIsClear() ) {
			move();
			if (noBeepersPresent() ){
				putBeeper();
			}
		}
		
		//to face south
		turnLeft();
		facingSouth() ;
		moveDoubleDouble();
		turnLeft();
		
		//to face south, move and drop beeper
		while (frontIsClear() ) {
			if (noBeepersPresent() ){
				putBeeper();
			}
			move();
			
		}
		
		//to face west
		turnRight();
		facingWest() ;
		moveDoubleDouble() ;

		//to face north, move and drop beeper
		turnRight();
		
		facingNorth();
		
		while (frontIsClear() ) {
			move();
			if (noBeepersPresent() ){
				putBeeper();
			}
		}
		
		//to face west
		turnLeft();
		facingWest();
		moveDoubleDouble();
		
		//to face South, move and drop beeper
		turnLeft();
		while (frontIsClear() ) {
			if (noBeepersPresent() ){
				putBeeper();
			}
			move();
			
		}
		//to face East
		turnLeft();
		facingEast();
		//
		
	}

	// End of Public algorithm
	
	
		/*start of private methods
		 * to declare move double
		 */
	private void moveDouble() {
		move();
		move();
	}
	
	//to declare move double double
	private void moveDoubleDouble() {
		moveDouble();
		moveDouble();
	}
	
	//end of the whole algorithm
}
