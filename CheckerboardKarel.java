/* File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

	// You fill in this part
	/*Turncool
	 * turnDoubleleft
	 * turn doubleRight
	 * move 
	 * Beeper
	 * 
	 
	 * 
	 * 
	 * (non-Javadoc)
	 * @see stanford.karel.SuperKarel#run()
	 */
	
	public void run(){
		if(beepersPresent()){
			move();
		}else {
				putBeeper();
			}
			
		 MoveDouble();
		 TurnDoubleLeft();
		 TurnDoubleRight();
		 BeeperDouble();
		 TurnCool();
		 move();
	}
	private void MoveDouble(){
	
		move();
		move();
		
		
	}
		
	private void TurnDoubleLeft(){
	MoveDouble();	
	TurnDoubleLeft();
	MoveDouble();
	
	
	}
	
	
	private void TurnDoubleRight(){
		move();
		TurnDoubleRight();
		move();
		
		
	}
	private void BeeperDouble(){
	move();
	putBeeper();
	
	move();
	putBeeper();

	move();
	putBeeper();
	}
		
	
	private void TurnCool(){
		move();
		TurnDoubleLeft();
		putBeeper();
	}
	}
	