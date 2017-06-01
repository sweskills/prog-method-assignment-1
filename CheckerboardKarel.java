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
	public void run(){
		putBeeper();
		turnLeft();
		move();
		while (frontIsClear()){
			if (beepersPresent()){
				move();
				pickBeeper();
			}
			else {
				putBeeper();
				move();
			}
		}
		turnRight();
		move();
		putBeeper();
		turnRight();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnRight();
		move();
		putBeeper();
		turnRight();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnRight();
		move();
		putBeeper();
		turnRight();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnLeft();
		move();
		putBeeper();
		turnLeft();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnRight();
		move();
		putBeeper();
		turnRight();
		while (frontIsClear()){
			if (beepersPresent()){
				pickBeeper();
				move();
			}
			else {
				move();
				putBeeper();
			}
		}
		turnLeft();
	}
}
