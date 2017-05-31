
/* File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
=======
/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
>>>>>>> 2a478c8eed6293e4391e53ddc041af9790e3cf67
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
	
	
		if(beepersPresent()){
			move();
		}else {
				putBeeper();
			}
		public void run(){
		 MoveDouble();
		 TurnDoubleLeft();
		 TurnDoubleRight();
		 BeeperDouble();
		 TurnCool();
		
	}
	private void MoveDouble(){
	
		move();
		move();
		
		
	}
		
	private void TurnDoubleLeft(){
	move();	
	TurnDoubleLeft();
	move();
	
	
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
	
