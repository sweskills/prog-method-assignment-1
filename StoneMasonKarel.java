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
		turnLeft();
		ascendWhilePlacingStones();
		moveToNextColumn();
		turnRight();
		descendWhilePlacingStones();
		moveToNextColumn();
		turnLeft();
		ascendWhilePlacingStones();
		moveToNextColumn();
		turnRight();
		descendWhilePlacingStones();
		turnLeft();
		
		
	}
	
	private void ascendWhilePlacingStones(){ 
		while (frontIsClear())
			if (beepersPresent()){
				move();
			}
			else {
				putBeeper();				
				move();
			}
		turnRight();
	}
		
	
	private void descendWhilePlacingStones(){
		while (frontIsClear())
			if (beepersPresent()){
				move();
			}
			else {
				putBeeper();				
				move();
			}
		turnLeft();
	} 
	
	private void moveToNextColumn(){
		for (int i=0; i<4;i++){
			move();
		}
	}
 
}		
