/* ZelinskyVincentH1.java
 * Written by Vincent Zelinsky
 * 
 * Demonstrates Object Oriented Design principles, class inheritance and data encapsulation, through classes representative of things you'd find in a Role Playing Game.
 */
//Tests values of various object's fields through their methods to confirm proper design and implementation
class ZelinskyVincentH1 
{
  //Main method that creates objects, tests their methods, and prints results to console for validation
  public static void main (String[] args)
  {
    //Creates an instance of the Item class known as i
    Item i = new Item();
    
    //Initializes variables ItemName, ItemWeight, and ItemExamine and sets them to corresponding method calls
    String ItemName = i.getName();
    int ItemWeight = i.getWeight();
    String ItemExamine = i.examine();
    
    //Prints to console the values of Item i's fields
    System.out.println ("Item name = "+ItemName);
    System.out.println ("Item weight = "+ItemWeight);
    System.out.println ("Item examine = "+ItemExamine);
    
    //Creates an instance of the Weapon class known as w
    Weapon w = new Weapon();
    
    //Initializes variables WeaponName, WeaponWeight, WeaponExamine, and WeaponDamage and sets them to corresponding method calls
    String WeaponName = w.getName();
    int WeaponWeight = w.getWeight();
    String WeaponExamine = w.examine();
    int WeaponDamage = w.getDamage();
    
    //Prints to console the values of Weapon w's fields after a new line for clarity
    System.out.println ("\nWeapon name = "+WeaponName);
    System.out.println ("Weapon weight = "+WeaponWeight);
    System.out.println ("Weapon examine = "+WeaponExamine);
    System.out.println ("Weapon damage = "+WeaponDamage);
  }
}
//Superclass of Weapons, Armor, and Nutrition
//Contains get methods to the private fields: Name, Weight, Examine
class Item 
{
  //Initializes and sets values for Name, Weight, Examine fields
  private String Name = "insert item name here";
  private int Weight = 1;
  private String Examine = "insert item description here";
  
  //Get method to return the String value of Name
  String getName() 
  {
    return Name;
  }
  //Get method to return the int value of Weight
  int getWeight() 
  {
    return Weight;
  }
  //Get method to return the String value of Examine
  String examine() 
  {
    return Examine;
  }
}
//Contains get method to the private field of Damage
class Weapon extends Item 
{
  //Initializes and sets value for Damage field
  private int Damage = 2;
  
  //Get method to return the int value of Damage
  int getDamage() 
  {
    return Damage;
  }
}