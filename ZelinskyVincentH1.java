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
    
    //Creates an instance of the Armor class known as a
    Armor a = new Armor();
    
    //Initializes variables ArmorName, ArmorWeight, ArmorExamine, and ArmorDefense and sets them to corresponding method calls
    String ArmorName = a.getName();
    int ArmorWeight = a.getWeight();
    String ArmorExamine = a.examine();
    int ArmorDefense = a.getDefense();
    
    //Prints to console the values of Armor a's fields after a new line for clarity
    System.out.println ("\nArmor name = "+ArmorName);
    System.out.println ("Armor weight = "+ArmorWeight);
    System.out.println ("Armor examine = "+ArmorExamine);
    System.out.println ("Armor defense = "+ArmorDefense);
    
    //Creates an instance of the Food class known as f
    Food f = new Food();
    
    //Initializes variables FoodName, FoodWeight, FoodExamine,FoodNutrition, and FoodQuantity and sets them to corresponding method calls
    String FoodName = f.getName();
    int FoodWeight = f.getWeight();
    String FoodExamine = f.examine();
    int FoodNutrition = f.getNutrition();
    int FoodQuantity = f.getQuantity();
    
    //Calls the setQuantity method and changes the value of Quantity to 6
    f.setQuantity(6);
    
    //Initializes the variable FoodQuantityNew to the new value of Quantity
    int FoodQuantityNew = f.getQuantity();
    
    //Prints to console the values of Food f's fields after a new line for clarity
    System.out.println ("\nFood name = "+FoodName);
    System.out.println ("Food weight = "+FoodWeight);
    System.out.println ("Food examine = "+FoodExamine);
    System.out.println ("Food nutrition = "+FoodNutrition);
    System.out.println ("Food quantity = "+FoodQuantity);
    
    //Prints to console the changed value of Quantity
    System.out.println ("Food new quantity = "+FoodQuantityNew);
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
//Contains get method to the private field of Defense
class Armor extends Item
{
  //Initializes and sets value for Defense field
  private int Defense = 3;
  
  //Get method to return the int value of Defense
  int getDefense()
  {
    return Defense;
  }
}
//Contains get method for Nutrition as well as getter and setter methods for Quantity
class Food extends Item
{
  //Initializes and sets values for Nutrition and Quantity fields
  private int Nutrition = 4;
  private int Quantity = 5;
  
  //Get method to return the int value of Nutrition
  int getNutrition()
  {
    return Nutrition;
  }
  //Get method to return the int value of Quantity
  int getQuantity()
  {
    return Quantity;
  }
  //Set method to update the int value of Quantity
  void setQuantity(int newValue)
  {
    Quantity = newValue;
  }
}