/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

//INCOMPLETE

import stanford.karel.*;


public class CheckerboardKarel extends SuperKarel {

	public void run(){
		
		navigate();
		}
	
private void dropBeeper() {
		
		putBeeper();
		move();
		if (frontIsClear() && (beepersPresent())) {
			move();
		} else {
			putBeeper();
			directionChange();
		}
	}
	
	
	private void navigate() {
		
		if (frontIsClear()) {
				dropBeeper();
				directionChange();
		}
	}
	
	private void directionChange() {
		if (frontIsBlocked() && (facingEast())){
			faceNorth();
			move();
			faceWest();
			navigate();
		}
		if (frontIsBlocked() && (facingWest())){
			faceNorth();
			move();
			faceEast();
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
}
	

	
	

