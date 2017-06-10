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

	// You fill in this part
	public void run() {
		putBeeper();
		fillEastWard();
		fillWestWard();
	}
	private void fillEastWard(){
		fillAlternate();
		turnLeft();
		if (frontIsClear()){
			fillNewLine();
			turnLeft();
			fillWestWard();
		}
	}
    
	private void fillWestWard(){
		fillAlternate();
		turnRight();
		if (frontIsClear()){
			fillNewLine();
			turnRight();
			fillEastWard();
		}
	}
    private void fillNewLine(){
    	if (beepersPresent()){
    		move();
    	}else{
    		move();
    		putBeeper();
    	}
    }
    
	
    private void fillAlternate(){
    	while (frontIsClear()){
    		if (beepersPresent()){
    			move();
    		}
    		else{
    			move();
    			putBeeper();
    		}
    		
    	}
    }
}