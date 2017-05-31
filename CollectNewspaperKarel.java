/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	// Karel needs to move towards the newspaper pick it up and return to its position
	public void run() {
		 moveToBeeper();
		 pickBeeper();
		 turnRight();
		 
		 
		}

	private void moveToBeeper() {
		// TODO Auto-generated method stub
		move();
		turnRight();
		move();
		turnLeft();
		move();
		
	} 
}
