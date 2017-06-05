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

	// To complete this task Karen needs to ascend and descend while replacing the missing stones
	// Karen also need to move eastwards four consecutive times to bridge the gap between columns
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
/*the method above instructs Karen to place stones wherever their missing as long as the front 
 * is clear, and if the front is blocked he simply turns right.
 */
			
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
/*this method instructs Karen to move eastwards four consecutive times without placing any stone(s).
 * 
 */
 
}		
