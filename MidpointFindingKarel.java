
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

// seek for the next cell with beeper
// if beeper is in the next cell then pick beeper
//move to other end of wall and loop.
// end if beeper in a cell but beeper not in the next cell
public class MidpointFindingKarel extends SuperKarel {
	public void run() {
		// fill up 1st street with beepers
		fill1stRow();
		while (true) {
			faceEastOrWest();
			seekCellWithBeeper();
			if (beeperOnNextCell()) {
				pickBeeper();
			} else {
				break;
			}
			moveToWall();
		}
	}

	private boolean beeperOnNextCell() {
		move();
		boolean rtn = beepersPresent();
		moveBack();
		return rtn;
	}

	private void moveBack() {
		turnMultipleLeft(2);
		move();
		turnMultipleLeft(2);

	}

	private void seekCellWithBeeper() {
		while (noBeepersPresent()) {
			move();
		}

	}

	private void faceEastOrWest() {
		faceEast();
		if (frontIsBlocked()) {
			faceWest();
		}

	}

	private void fill1stRow() {
		while (frontIsClear()) {
			placeOneBeeper();
			move();
		}
		placeOneBeeper();
	}

	private void placeOneBeeper() {
		if (noBeepersPresent()) {
			putBeeper();
		}
	}

	private void moveToWall() {
		while (frontIsClear()) {
			moveMultiple(1);
		}
	}

	private void moveMultiple(int n) {
		for (int i = 1; i <= n; i++) {
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
