/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {
	public void run() {
		/*start of main
		 * Karel drop beeper
		 */
		putBeeper();
		
		//Karel move in two steps and drop beeper and then move to another row
		beeperDropping();
		if (frontIsClear() )	{
			move()
		}

		
		
		//Karel move in two steps and drop beeper and then move to another row
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnDoubleRight();
		
		//Karel move in two steps and drop beeper and then move to another row
		putBeeper();
		beeperDropping();
		
		//Karel move in two steps and drop beeper and then move to another row
		madeEasy();
		beeperDropping();
		move();
		turnRight();
		
		//end of public methods
	}
		
		
	/*start of private methods
	 * this section declare my own person methods
	 * leggo!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */

	//Karel move in two steps
	private void moveDouble() {
		move();
		move();
	}
	//karel make a turn around move in left sideways
	private void turnDoubleLeft() {
		turnLeft();
		move();
		turnLeft();
	}
	//karel make a turn around move in right sideways
	private void turnDoubleRight() {
		turnRight();
		move();
		turnRight();
	}
	//karel is making a double move and also dropping beeper
	private void beeperDropping() {
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
		
		moveDouble();
		putBeeper();
	}
	//karel make move, make a double left turn and then drop beeper
	private void madeEasy() {
		move();
		turnDoubleLeft();
		putBeeper();
	}

	//End of program
}
