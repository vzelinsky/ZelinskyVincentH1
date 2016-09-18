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
    Weapon Sword_1 = new Weapon ("Steel sword",4,"An average steel longsword, a finely balanced weapon but otherwise unremarkable.",3);
    //Prints the returned values from Sword_1 for validation
    System.out.println (Sword_1.getName()+"\n"+Sword_1.getWeight()+"\n"+Sword_1.getDamage()+"\n"+Sword_1.getExamine()+"\n");
    
    //Creates an Armor object called Armor_1 and passes values to its fields
    Armor Armor_1 = new Armor ("Leather Armor",15,"Hardened leather plates, normally used for sparring, this armor can at least dampen any blows received.",2);
    //Prints the returned values from Sword_1 for validation
    System.out.println (Armor_1.getName()+"\n"+Armor_1.getWeight()+"\n"+Armor_1.getDefense()+"\n"+Armor_1.getExamine()+"\n");
    
    //Creates a Food object called Food_1 and passes values to its fields
    Food Food_1 = new Food ("Bread",1,"One fresh loaf of bread.",30,1);
    //Prints the returned values from Food_1 for validation
    System.out.println (Food_1.getName()+"\n"+Food_1.getWeight()+"\n"+Food_1.getNutrition()+"\n"+Food_1.getQuantity()+"\n"+Food_1.getExamine()+"\n");
    //Tests the setQuantity method and the getWeight method and prints for validation
    Food_1.setQuantity(2);
    System.out.println (Food_1.getQuantity()+"\n"+Food_1.getWeight()+"\n"+Food_1.getExamine());
  }
}