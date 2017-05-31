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

	// You fill in this part
	/*
	 * File: StoneMasonKarel.java
	 * --------------------------
	 * The StoneMasonKarel subclass as it appears here does nothing.
	 * When you finish writing it, it should solve the "repair the quad"
	 * problem from Assignment 1.  In addition to editing the program,
	 * you should be sure to edit this comment so that it no longer
	 * indicates that the program does nothing.
	 */

	 public void run () {
	  faceNorth();
	  fillColumn();
	//  goToStartOfNextColumn();
	  goToNextColumn();
	  faceSouth();
	  fillColumn();
	  goToNextColumn();
	  faceNorth();
	  fillColumn();
	  goToNextColumn();
	  faceSouth();
	  fillColumn();
	  }
	 
	  private void fillColumn(){
	   while (frontIsClear()){
	    if (beepersPresent()){
	     moveMultiple(1);
	    }
	    else {
	     putBeeper();
	     moveMultiple(1);
	    }
	   } 
	  }
	  
	  private void goToNextColumn(){
	   faceEast();
	   moveMultiple(4);
	//   moveToWall();
	  }
	  
	  private void goToStartOfNextColumn(){
	   faceEast();
	   moveMultiple(4);
	   faceSouth();
	//   moveToWall();
	  }
	  
	  private void moveMultiple(int n) {
	  for (int i=1; i<=n; i++){
	   move();
	  }
	 }

	 private void moveToWall(){
	      while (frontIsClear()){
	       move();
	      }
	     }
	     private void faceSouth(){
	      
	   if (facingEast()){
	    turnMultipleLeft(3);
	   }
	   else if (facingNorth()){
	    turnMultipleLeft(2);
	   }
	   else if (facingWest()){
	    turnMultipleLeft(1);
	   }
	     }
	     
	     private void faceEast(){
	   if (facingNorth()){
	    turnMultipleLeft(3);
	   }
	   else if (facingSouth()){
	    turnMultipleLeft(1);
	   }
	   else if (facingWest()){
	    turnMultipleLeft(2);
	   }
	     }
	     
	     private void faceNorth(){
	   if (facingEast()){
	    turnMultipleLeft(1);
	   }
	   else if (facingSouth()){
	    turnMultipleLeft(2);
	   }
	   else if (facingWest()){
	    turnMultipleLeft(3);
	   }
	     }
	     
	     private void faceWest(){
	   if (facingEast()){
	    turnMultipleLeft(2);
	   }
	   else if (facingSouth()){
	    turnMultipleLeft(3);
	   }
	   else if (facingNorth()){
	    turnMultipleLeft(1);
	   }
	      
	     }
	     
	     private void turnMultipleLeft(int n){
	      for (int i=1; i<=n; i++){
	       turnLeft();
	      }
	     }

	}