/* File: MidpointFindingKarel.java  */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	/* Name: Enoch Mbaebie
	/ *  Karel is program to place a single beeper at the center of 1st street.*/
	
	public void run() {
		putBeeper();
		walkToWall();
		putBeeper();
		turnAround();
		walkToBeeper();
		while (noBeepersPresent()){
			putBeeper();
			turnAround();
			walkToBeeper();
		}
		clearRightOfCenter();
		clearLeftOfCenter();
		turnAround();
		walkToBeeper();
		move();
		
	}
	
	/* clearRightOfCenter() */
	
	private void clearRightOfCenter(){
		clearToWall();
	}
	private void clearToWall(){
		while (frontIsClear()){
			move();
			if (beepersPresent()){
				pickBeeper();
			}
		}
	}	
		private void clearLeftOfCenter(){
		turnAround();
		walkToBeeper();
		move();
		while (frontIsClear()){
			move();
			pickBeeper();
		}
	}
	
	/* walkToWall() */
	
	private void walkToWall(){
		while (frontIsClear()){
			move();
		}
	}
	
	/* walkToBeeper() */

	private void walkToBeeper(){
		move();
		while (noBeepersPresent()){
			move();
		}
		moveBackward();
	}
	
	/* moveBackware() */

	private void moveBackward(){
		turnAround();
		move();
		turnAround();
	}

}