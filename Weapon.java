//Creates the class Weapon which contains the fields for name, weight, examine, and damage
public class Weapon extends Item{
  //Declares the fields damage and examine
  private int damage;
  private String examine;
  
  //Creates a constructor for Weapon that invokes the second constructor in Item and adds to it
  public Weapon (String name, int weight, String examine, int damage){
    super(name, weight);
    this.examine = examine;
    this.damage = damage;
  }
  //Creates a method to get damage
  public int getDamage(){
    return damage;
  }
  //Overloads the getExamine method so when called it adds damage
  /* It was here that I decided that the player can only interact with the various objects of the game through the getExamine method.
   * Therefore, the getExamine method needs to give the player all the information they could require.
   */ 
  @Override
  public String getExamine(){
    return examine+"\nIts name is: "+getName()+"\nIts weight is: "+getWeight()+"\nIts damage is: "+damage;
  }
}