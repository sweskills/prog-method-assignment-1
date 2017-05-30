/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

	public void run () {
		moveToNewsPaper();
    	pickUpNewsPaper();
		returnToStartPosition();
	}
   
    private void moveToNewsPaper() {
    	//move while front is clear
    	moveToWall();
    	faceSouth();
    	move();
    	faceEast();
    	move();
    }
    
    private void pickUpNewsPaper(){
    	pickBeeper();
    }
    
    private void returnToStartPosition (){
    	turnMultipleLeft(2);
    	moveToWall();
    	turnMultipleLeft(3);
    	moveToWall();
    	turnMultipleLeft(3);

    }
    
    private void moveToWall(){
    	while (frontIsClear()){
    		move();
    	}
    }
    private void faceSouth(){
    	turnMultipleLeft(3);
    }
    
    private void faceEast(){
    	turnMultipleLeft(5);
    }
    
    private void turnMultipleLeft(int n){
    	for (int i=1; i<=n; i++){
    		turnLeft();
    	}
    }
}
