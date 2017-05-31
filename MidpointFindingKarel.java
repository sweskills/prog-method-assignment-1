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


	public void run() {
		
		putBeeper();
	
	}
	
	private void checkBeeper() {
		if(beepersPresent()) {
			beeperMove();
		}
	}
	
	private void beeperMove() {
		while (frontIsClear()){
			move();
		}
	}
	
	private void directionChange() {
		if (frontIsBlocked() && (facingEast())){
			turnAround();
		}
		if (frontIsBlocked() && (facingWest())){
			turnAround();
		}
		}
	
	private void faceSouth(){
		if (facingEast()) {
			turnRight();
		}
		if (facingNorth()) {
			turnRight();
			turnRight();
		}
		if (facingWest()) {
			turnLeft();
		}
	}
	
	private void faceNorth(){
		if (facingEast()) {
			turnLeft();
		}
		if (facingSouth()) {
			turnRight();
			turnRight();
		}
		if (facingWest()) {
			turnRight();
		}
	}
	
	private void faceWest(){
		if (facingNorth()) {
			turnLeft();
		}
		if (facingSouth()) {
			turnRight();
		}
		if (facingEast()) {
			turnRight();
			turnRight();
		}
	}
		
	private void faceEast(){
		if (facingNorth()) {
			turnRight();
		}
		if (facingSouth()) {
			turnLeft();
		}
		if (facingWest()) {
			turnRight();
			turnRight();
		}
	}

}
