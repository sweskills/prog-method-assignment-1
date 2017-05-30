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
		fillEastWards();
		goToNextRow();
		fillWestWards();
//		while (notAtTheTop()){ 
//			fillEastWards();
////			goToNextRow();
////			fillWestWards();
//		}
	}

private void fillWestWards() {
	faceWest();
	while (frontIsClear()){
		 placeSpacedBeeper();
	 }
}

private void fillEastWards(){
	faceEast();
	while (frontIsClear()){
		 placeSpacedBeeper();
	 }
}

private void placeSpacedBeeper() {
	 placeOneBeeper();
	 for ( int i=1; i<=2; i++){
		 if (frontIsClear()){
			 moveMultiple(1);
		 } 
	 }
}

private void goToNextRow() {
	faceNorth();
	move();
	faceEast();
	if (frontIsBlocked()){
		faceWest();
	}
	
}

//	private boolean notAtTheTop() {
//		faceNorth();
//		
//		return false;
//	}


	
	
	 private void fillColumn(){
		faceNorth();	
//		if (frontIsBlocked()){
//			faceSouth();
//		}
		 while (frontIsClear()){
			 placeOneBeeper();
			 move();
		 }
		 placeOneBeeper();
		 faceSouth();
		 moveToWall();
		 faceEast();
	 }
	 
	 private void placeOneBeeper(){
		 if (noBeepersPresent()){
			 putBeeper();
		 }
	 }
	 
	 private void goToNextColumn(){
		 moveMultiple(4);
	 }
	 
	 private void moveMultiple(int n) {
		for (int i=1; i<=n; i++){
			move();
		}
	}

	private void moveToWall(){
	    	while (frontIsClear()){
	    		moveMultiple(1);
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
