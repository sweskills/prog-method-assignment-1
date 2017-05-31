/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {
	public void run() {
		
		//the satart of first row
		turnLeft();
		while (frontIsClear() ) {
		if (noBeepersPresent() ){
			putBeeper();
		}
		move();
		}
		
		//
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		//startb of second row
		turnLeft();
		moveDoubleDouble();
		turnLeft();
		while (frontIsClear() ) {
			if (noBeepersPresent() ){
				putBeeper();
			}
			move();
			}
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		//start of third row
		turnLeft();
		moveDoubleDouble();
		turnLeft();
		while (frontIsClear() )	{
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		//
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		
		//start of fourth row
		turnLeft();
		moveDoubleDouble();
		turnLeft();
		while (frontIsClear() )	{
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		
		//
		turnAround();
		while (frontIsClear()) {
			if (noBeepersPresent() )	{
				putBeeper();
			}
			move();
		}
		turnLeft();
	
	}
	
	//
	private void moveDouble() {
		move();
		move();
	}
	
	//
	private void moveDoubleDouble() {
		moveDouble();
		moveDouble();
	}
}