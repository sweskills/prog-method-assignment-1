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

	public void run () {
		fillColumn();
		goToNextColumn();
//		moveToNextColumn();
		}
	
	 private void fillColumn(){
		 faceNorth();
		 while (frontIsClear()){
			 if (beepersPresent()){
				 move();
			 }
			 else {
				 putBeeper();
				 move();
			 }
		 }
			 
		 
	 }
	 private void moveToWall(){
	    	while (frontIsClear()){
	    		move();
	    	}
	    }
	    private void faceSouth(){
	    	
			if (facingEast()){
				turnMultipleLeft(3);
			}
			else if (facingNorth()){
				turnMultipleLeft(2);
			}
			else if (facingWest()){
				turnMultipleLeft(1);
			}
	    }
	    
	    private void faceEast(){
			if (facingNorth()){
				turnMultipleLeft(3);
			}
			else if (facingSouth()){
				turnMultipleLeft(1);
			}
			else if (facingWest()){
				turnMultipleLeft(2);
			}
	    }
	    
	    private void faceNorth(){
			if (facingEast()){
				turnMultipleLeft(1);
			}
			else if (facingSouth()){
				turnMultipleLeft(2);
			}
			else if (facingWest()){
				turnMultipleLeft(3);
			}
	    }
	    
	    private void faceWest(){
			if (facingEast()){
				turnMultipleLeft(2);
			}
			else if (facingSouth()){
				turnMultipleLeft(3);
			}
			else if (facingNorth()){
				turnMultipleLeft(1);
			}
	    	
	    }
	    
	    private void turnMultipleLeft(int n){
	    	for (int i=1; i<=n; i++){
	    		turnLeft();
	    	}
	    }

}
