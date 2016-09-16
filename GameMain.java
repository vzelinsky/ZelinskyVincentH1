/* GameMain.java
 * Written by Vincent Zelinsky
 * 
 * Demonstrates Object Oriented Design principles, class inheritance and data encapsulation through classes representative of things you'd find in a Role Playing Game.
 */
//Tests values of various object's fields through calling methods to confirm proper design and implementation
public class GameMain{
  //Main method that creates objects, tests their methods, and prints results to console for validation
  public static void main (String[] args){
    
    //Creates an Item object called Note_1 and passes values to its fields
    Item Note_1 = new Item ("Random note",0,"A note that reads:\n\"To whom it may concern,\nIts dangerous to go alone take these items.\"");
    //Prints the returned values from Note_1 for validation
    System.out.println (Note_1.getName()+"\n"+Note_1.getWeight()+"\n"+Note_1.getExamine()+"\n");
    
    //Creates a Weapon object called Sword_1 and passes values to its fields
    Weapon Sword_1 = new Weapon ("Steel sword",3,"An average longsword not remarkable in any way.",30);
    //Prints the returned values from Sword_1 for validation
    System.out.println (Sword_1.getName()+"\n"+Sword_1.getWeight()+"\n"+Sword_1.getDamage()+"\n"+Sword_1.getExamine()+"\n");
  }
}