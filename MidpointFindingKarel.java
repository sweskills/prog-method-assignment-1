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


	public void run () {
        putEdgeBeepers();
        while (frontIsClear()) {
            LastBeeperWest();
            LastBeeperEast();
        }
    }
    private void putEdgeBeepers() {
        move();
        putBeeper();
        while (frontIsClear()) {
            move();
        }
        turnAround();
        move();
        putBeeper();
    }
    private void LastBeeperWest() {
        if (facingWest()) {
            move();
            if (noBeepersPresent()) {
                putBeeper();
            }
            turnAround();
            move();
            pickBeeper();
            turnAround();
            move();
            move();
        }
            detectMyBeeper();
            turnAround();
        }
    private void LastBeeperEast() {
        if (facingEast()) {
            pickBeeper();
            move();
            if(noBeepersPresent()) {
                putBeeper();
            }
            move();
            detectMyBeeper();
            turnAround();
        }
    }
    private void detectMyBeeper() {
        while (noBeepersPresent()) {
            if(frontIsClear()) {
                    move();
                }
            if(frontIsBlocked()) {
                turnAround();
                while(frontIsClear()) {
                    if(noBeepersPresent()) {
                        move();
                    }
                }
            }
        }
    }
    }
