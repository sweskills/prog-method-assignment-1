/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */
//
//
import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

//The Program is to make Karel pick up the newspaper and return to its primary position
	
	public void run() {
		moveToTheNewspaper();
		pickItUp();
		returnToStartingPoint();
	}

	

	//Moves Karel from its position to the point where the Newspaper is
	
	private void moveToTheNewspaper() {
	// TODO Auto-generated method stub
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
	}
		private void pickItUp() {
			// TODO Auto-generated method stub
			
		
		pickBeeper();
		}	
		
		private void returnToStartingPoint() {
			// TODO Auto-generated method stub
			
		turnAround();
		move();
		turnRight();
		move();
		turnLeft();
		move();
		move();
		turnAround();
	}

}
