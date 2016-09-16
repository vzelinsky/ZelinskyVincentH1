/* GameMain.java
 * Written by Vincent Zelinsky
 * 
 * Demonstrates Object Oriented Design principles, class inheritance and data encapsulation through classes representative of things you'd find in a Role Playing Game.
 */
//Tests values of various object's fields through calling methods to confirm proper design and implementation
public class GameMain{
  //Main method that creates objects, tests their methods, and prints results to console for validation
  public static void main (String[] args){
    Item Note_1 = new Item ("Random note",0,"A note that reads:\n\"To whom it may concern,\nIts dangerous to go alone take these items.\"");
    System.out.println (Note_1.getExamine());
  }
}