import stanford.karel.*;

public class CollectNewspaperKarel extends SuperKarel {

 public void run () {
  moveToNewsPaper();
     pickUpNewsPaper();
  returnToStartPosition();
 }
   
    private void moveToNewsPaper() {
     //move while front is clear
     moveToWall();
     faceSouth();
     move();
     faceEast();
     move();
    }
    
    private void pickUpNewsPaper(){
     pickBeeper();
    }
    
    private void returnToStartPosition (){
     turnMultipleLeft(2);
     moveToWall();
     turnMultipleLeft(3);
     moveToWall();
     turnMultipleLeft(3);
    }
    
    private void moveToWall(){
     while (frontIsClear()){
      move();
     }
    }
    private void faceSouth(){
     
     turnMultipleLeft(3);
    }
    
    private void faceEast(){
     turnMultipleLeft(5);
    }
    
    private void faceNorth(){
     
    }
    
    private void faceWest(){
     
    }
    
    private void turnMultipleLeft(int n){
     for (int i=1; i<=n; i++){
      turnLeft();
     }
    }
}