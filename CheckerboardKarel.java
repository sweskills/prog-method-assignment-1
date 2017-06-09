/*
 * File: CheckerboardKarel.java
 * ---------------------------- */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	public void run(){
	putBeeper();
	completeEast();
	}
	
	private void completeEast(){
		alternateToWall();
		turnLeft();
		if (frontIsClear()){
			startNext();
			turnLeft();
			completeWest();
		}
	}
	private void completeWest(){
		alternateToWall();
		turnRight();
		if (frontIsClear()){
			startNext();
			turnRight();
			completeEast();
		}
	}
	
	private void startNext(){
		if (beepersPresent()){
			move();	
		}
		else {
			move();
			putBeeper();
		}
	}
		private void alternateToWall(){
		while (frontIsClear()){
			if (beepersPresent()){
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
	}
}
	