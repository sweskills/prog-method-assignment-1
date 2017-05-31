/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * The CollectNewspaperKarel subclass adds the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	/* 
	 * The program is expected to make Karel 
	 * pick up the newspaper and return to its primary position
	 */
public void run(){
	moveToTheNewspaper();
	pickUpNewspaper();
	returnToStartingPoint();
	
}
	/* 
	 * Moves Karel from its current position
	 * to the point where the newspaper is 
	 */
private void moveToTheNewspaper(){
	turnRight();
	move();
	turnLeft();
	move();
	move();
	move();
}

/*
 * Karel picks up the newspaper
 */
private void pickUpNewspaper(){
	pickBeeper();
}
/*
 * Karel returns to the point it started from and in the same position
 */
private void returnToStartingPoint(){
	turnAround();
	move();
	move();
	move();
	turnRight();
	move();
	turnRight();
}
}
