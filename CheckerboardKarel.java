
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
		fill1stRow();
		while (notAtTheTop()) {
			goToNextRow();
			if (facingEast()) {
				fillEastWards();
			} else if (facingWest()) {
				fillWestWards();
			}
		}
	}

	private void fillEastWards() {
		while (frontIsClear()) {
			placeCellBeeper();
			faceEast();
			move();
		}
		fillLastBeeper();
	}

	private void fillWestWards() {
		while (frontIsClear()) {
			placeCellBeeper();
			faceWest();
			move();
		}
		fillLastBeeper();
	}

	private void placeCellBeeper() {
		faceSouth();
		move();
		if (noBeepersPresent()) {
			faceNorth();
			move();
			placeOneBeeper();
		} else {
			faceNorth();
			move();
		}

	}

	private void fill1stRow() {
		faceEast();
		placeSpacedBeeper();
	}

	private void fillLastBeeper() {
		if (noBeepersPresent()) {
			faceOpposite();
			move();
			if (noBeepersPresent()) {
				faceOpposite();
				move();
				placeOneBeeper();
			} else {
				faceOpposite();
				move();
			}
		}

	}

	private void faceOpposite() {
		if (facingNorth()) {
			faceSouth();
		} else if (facingSouth()) {
			faceNorth();
		} else if (facingEast()) {
			faceWest();
		} else if (facingWest()) {
			faceEast();
		}
	}

	private void placeSpacedBeeper() {
		placeOneBeeper();
		while (frontIsClear()) {
			placeOneBeeper();
			moveMultiple(2);
		}
		;
		fillLastBeeper();

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
			if (frontIsClear())
				move();
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
