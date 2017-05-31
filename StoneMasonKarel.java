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

	// You fill in this part
	public void run(){
		for (int i=0; i<4; i++){
		placeBeeperTillWall();
		returnToStartingPoint();
		moveToTheNextColumn();
		}
		
	}

	private void moveToTheNextColumn() {
		// TODO Auto-generated method stub
		for (int i=0; i<4; i++){
			move();
		}
	}

	private void returnToStartingPoint() {
		// TODO Auto-generated method stub
		turnRight();
		turnRight();
		while (frontIsClear()){
			move();
		}
	
			turnLeft();
			
		}
	

	private void placeBeeperTillWall() {
		// TODO Auto-generated method stub
		turnLeft();
		while (frontIsClear()||noBeepersPresent()){
			
			
				putBeeper();
				move();
			
			}
		
	}
	

}
