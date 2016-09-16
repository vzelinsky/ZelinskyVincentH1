//Creates the class Weapon which contains the fields for name, weight, examine, and damage
public class Weapon extends Item{
  //Declares the field damage
  private int damage;
  //Creates a constructor for Weapon
  public Weapon (String name, int weight, String examine, int damage){
    super(name, weight, examine);
    this.damage = damage;
  }
  //Creates a method to get damage
  public int getDamage(){
    return damage;
  }
}