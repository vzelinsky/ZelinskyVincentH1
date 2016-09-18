/* Weapon.java
 * Written by Vincent Zelinsky
 * 
 * Creates the Weapon subclass of Item which contains the fields damage and examine; invokes the second constructor in Item; creates a getDamage method and overloades the getExamine method.
 * 
 * The reason for overriding examine and invoking a constructor that doesn't contain it is to include damage in the examine return. 
 * I decided that the player can only interact with the various objects of the game through the getExamine method.
 * Therefore, the getExamine method needs to give the player all the information they could require about a particular object.
 */
//Creates the class Weapon which contains the fields for name, weight, examine, and damage
public class Weapon extends Item{
  //Declares the fields damage and examine
  private int damage;
  private String examine;
  
  //Creates a constructor for Weapon that invokes the second constructor in Item and adds to it
  public Weapon (String nameInput, int weightInput, String examineInput, int damageInput){
    super(nameInput, weightInput);
    this.examine = examineInput;
    this.damage = damageInput;
  }
  //Creates a method to get damage
  public int getDamage(){
    return damage;
  }
  //Overloads the getExamine method so when called it adds damage 
  @Override
  public String getExamine(){
    return examine+"\nIts name is: "+getName()+"\nIts weight is: "+getWeight()+"\nIts damage is: "+damage;
  }
}