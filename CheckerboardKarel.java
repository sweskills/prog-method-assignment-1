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

	public void run(){
		
		navigate();
	}
	
	private void navigate() {
		
		while (!frontIsBlocked()) {
			move();
			directionChange();
		}
		
	}
	
	private void directionChange() {
		if (frontIsBlocked() && (facingSouth())){
			faceNorth();
			faceWest();
			navigate();
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
		
	private void fastRun() {
	for (int i=0; i<4; i++)
	{
	move();
	}

}
	
}
	
	

