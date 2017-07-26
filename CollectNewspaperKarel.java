/*
 * File: CollectNewspaperKarel.java
 * --------------------------------
 * At present, the CollectNewspaperKarel subclass does nothing.
 * Your job in the assignment is to add the necessary code to
 * instruct Karel to walk to the door of its house, pick up the
 * newspaper (represented by a beeper, of course), and then return
 * to its initial position in the upper left corner of the house.
 */

import stanford.karel.*;
import acm.graphics.*;

public class CollectNewspaperKarel extends SuperKarel {
	public void run() {

	 moveDouble();
     turnAround();
     turnLeft();
     move();

 turnLeft();
 move();
     pickBeeper();
     turnAround();


     move();
     move();
     move();
     turnRight();

     move();
     turnRight();

 }
    
     private void moveDouble() {
         while(frontIsClear()){
         move();
         move();
         }
  
 }

}
