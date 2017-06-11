/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * When you finish writing it, the MidpointFindingKarel class should
 * leave a beeper on the corner closest to the center of 1st Street
 * (or either of the two central corners if 1st Street has an even
 * number of corners).  Karel can put down additional beepers as it
 * looks for the midpoint, but must pick them up again before it
 * stops.  The world may be of any size, but you are allowed to
 * assume that it is at least as tall as it is wide.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

	public void run(){
        countRows();
        moveAllBeepersToFirstCorner();
        findMidpoint();
    }
    // this method places a beeper on each row
    private void countRows(){
        turnLeft();
        putBeeper();
        while(frontIsClear()){
            if (frontIsClear()) move();
            putBeeper();
        }
        turnAround();
    }
    // here every beeper is moved to the first corner
    private void moveAllBeepersToFirstCorner(){
        while (frontIsClear()){
            pickBeeper();
            if (frontIsClear()) move();
            putBeeper();
            turnAround();
            move();
            turnAround();
            if (noBeepersPresent()) move();
        }
    }
    // this method makes Karel take two beepers and move one to the next corner
    private void findMidpoint(){
        turnLeft();
        while (beepersPresent()) {
            pickBeeper();
            if (beepersPresent()){
                pickBeeper();
            }
            move();
            putBeeper();
            turnAround();
            move();
            turnAround();
            if (noBeepersPresent()){
                move();
                pickBeeper();
                if (noBeepersPresent()) break;
                putBeeper();
            }
        }
        putBeeper();
    }

}
