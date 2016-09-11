/* ZelinskyVincentH1.java
 * Written by Vincent Zelinsky
 * 
 * Demonstrates Object Oriented Design principles, class inheritance and data encapsulation, through classes representative of things you'd find in a Role Playing Game.
 */
class ZelinskyVincentH1 
{
  public static void main (String[] args)
  {
  }
}
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