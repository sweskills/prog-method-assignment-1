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

/* To get to the Newspaper Karen performs basically three actions and these actions are
 * introduced as methods under the public void 'run' and the individual actions are then
 * further explained as private voids
 */
	public void run(){
		moveToNewspaper();
		pickUpNewspaper();
		returnToInitialPosition();
	}
	private void moveToNewspaper(){
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();	
	}
	
	private void pickUpNewspaper(){
		if (beepersPresent())
		{
		pickBeeper();
			}
		}
	private void returnToInitialPosition(){
		turnAround();
		move();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		turnAround();
	}
	
	
	

}
