
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
//		while (notAtTheTop()) {
//			fillRow();
//			goToNextRow();
//		}
//		fillRow();
//		faceNorth();
		placeOneBeeper();
		while (notAtTheTop()) {
			fillDiagonal();
			

		}
		
	}

	private void moveDiagonal() {
		placeOneBeeper();
		faceNorth();
		move();
		faceEast();
		move();		
	}

	private void fillRow() {
		faceEast();
		if (frontIsBlocked()) {
			faceWest();
		}
		placeSpacedBeeper();
	}

	private void placeSpacedBeeper() { 
		while (frontIsClear()) {
			placeOneBeeper();
			for (int i = 1; i <= 2; i++) {
				if (frontIsClear()) {
					moveMultiple(1);
				}
			}
		}
	}

	private void goToNextRow() {
		faceNorth();
		move();
		faceEast();
		if (frontIsBlocked()) {
			faceWest();
		}

	}

	private boolean notAtTheTop() {
		faceNorth();
		if (frontIsBlocked()) {
			return false;
		} else {
			return true;
		}
	}

	private void placeOneBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	private void moveMultiple(int n) {
		for (int i = 1; i <= n; i++) {
			move();
		}
	}

	private void moveToWall() {
		while (frontIsClear()) {
			moveMultiple(1);
		}
	}

	private void faceSouth() {

		if (facingEast()) {
			turnMultipleLeft(3);
		} else if (facingNorth()) {
			turnMultipleLeft(2);
		} else if (facingWest()) {
			turnMultipleLeft(1);
		}
	}

	private void faceEast() {
		if (facingNorth()) {
			turnMultipleLeft(3);
		} else if (facingSouth()) {
			turnMultipleLeft(1);
		} else if (facingWest()) {
			turnMultipleLeft(2);
		}
	}

	private void faceNorth() {
		if (facingEast()) {
			turnMultipleLeft(1);
		} else if (facingSouth()) {
			turnMultipleLeft(2);
		} else if (facingWest()) {
			turnMultipleLeft(3);
		}
	}

	private void faceWest() {
		if (facingEast()) {
			turnMultipleLeft(2);
		} else if (facingSouth()) {
			turnMultipleLeft(3);
		} else if (facingNorth()) {
			turnMultipleLeft(1);
		}
	}

	private void turnMultipleLeft(int n) {
		for (int i = 1; i <= n; i++) {
			turnLeft();
		}
	}

}
